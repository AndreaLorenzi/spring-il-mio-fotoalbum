package org.lessons.java.springilmiofotoalbum.service;

import org.lessons.java.springilmiofotoalbum.exceptions.PhotoNotFoundException;
import org.lessons.java.springilmiofotoalbum.model.Photo;
import org.lessons.java.springilmiofotoalbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;


    public List<Photo> getPhotoList(Optional<String> search) {

        if (search.isPresent()) {
            // se il parametro di ricerca è presente filtro la lista dei libri
            return
                    photoRepository.findByTitleContainingIgnoreCase(search.get());
        } else {
            // altrimenti prendo tutti i libri non filtrati
            // bookRepository recupera da database la lista di tutti i libri
            return photoRepository.findAll();
        }
    }

    public List<Photo> getPhotoList() {
        return photoRepository.findAll();
    }

    public Photo getPhotoById(Integer id) throws PhotoNotFoundException {
        Optional<Photo> result = photoRepository.findById(id);
        // verifico se il risultato è presente
        if (result.isPresent()) {
            return result.get();
        } else {
            // se non ho trovato il libro sollevo un'eccezione
            throw new PhotoNotFoundException("pizza with id " + id + " not found");
        }
    }

    public Photo createPhoto(Photo photo) throws PhotoNotFoundException {
        photo.setId(null);
        try {
            return photoRepository.save(photo);
        } catch (RuntimeException e) {
            throw new PhotoNotFoundException(photo.getTitle());
        }
    }

    public Photo editPhoto(Photo photo) throws PhotoNotFoundException {
        Photo photoToEdit = getPhotoById(photo.getId());
        photoToEdit.setTitle(photo.getTitle());
        photoToEdit.setDescription(photo.getDescription());
        photoToEdit.setUrl(photo.getUrl());
        photoToEdit.setVisible(photo.isVisible());
        photoToEdit.setCategories(photo.getCategories());

        return photoRepository.save(photoToEdit);
    }

    public void deletePhoto(Integer id) {
        photoRepository.deleteById(id);
    }

    public Page<Photo> getPage(Pageable pageable) {
        return photoRepository.findAll(pageable);
    }

    public List<Photo> getPhotoVisibility(Optional<String> search) {
        if (search.isPresent()) {
            return photoRepository.findByVisibleAndTitleContainingIgnoreCase(true, search.get());
        } else {
            return photoRepository.findByVisible(true);
        }
    }
    
}
