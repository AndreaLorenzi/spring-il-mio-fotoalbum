package org.lessons.java.springilmiofotoalbum.repository;

import org.lessons.java.springilmiofotoalbum.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findByOrderByName();

    boolean existsByName(String name);
}
