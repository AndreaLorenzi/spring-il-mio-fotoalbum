package org.lessons.java.springilmiofotoalbum.service;

import org.lessons.java.springilmiofotoalbum.exceptions.ContactNotFoundException;
import org.lessons.java.springilmiofotoalbum.model.Contact;
import org.lessons.java.springilmiofotoalbum.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    //Index
    public List<Contact> getContactList() {
        return contactRepository.findAll();
    }

    //Show
    public Contact getContactById(Integer id) throws ContactNotFoundException {
        Optional<Contact> result = contactRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "contact with id " + id + " not found");
        }
    }

    //Create
    public Contact createContact(Contact contact) {
        contact.setId(null);
        return contactRepository.save(contact);
    }

    //Delete
    public void deleteContact(Integer id) {
        contactRepository.deleteById(id);
    }

}
