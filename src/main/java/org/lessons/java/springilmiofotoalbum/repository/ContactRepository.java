package org.lessons.java.springilmiofotoalbum.repository;

import org.lessons.java.springilmiofotoalbum.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
