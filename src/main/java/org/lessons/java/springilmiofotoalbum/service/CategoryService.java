package org.lessons.java.springilmiofotoalbum.service;

import org.lessons.java.springilmiofotoalbum.exceptions.CategoryNameUniqueException;
import org.lessons.java.springilmiofotoalbum.model.Category;
import org.lessons.java.springilmiofotoalbum.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.findByOrderByName();
    }

    public Category getCategoryById(Integer id) throws CategoryNameUniqueException {
        Optional<Category> result = categoryRepository.findById(id);
        // verifico se il risultato è presente
        if (result.isPresent()) {
            return result.get();
        } else {
            // se non ho trovato il libro sollevo un'eccezione
            throw new CategoryNameUniqueException("ingredient with id " + id + " not found");
        }
    }

    public Category save(Category category) throws CategoryNameUniqueException {
        if (categoryRepository.existsByName(category.getName())) {
            throw new CategoryNameUniqueException(category.getName());
        }
        category.setName(category.getName().toLowerCase());
        return categoryRepository.save(category);
    }

    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }
}
