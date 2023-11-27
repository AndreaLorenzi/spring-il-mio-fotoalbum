package org.lessons.java.springilmiofotoalbum.exceptions;

public class ContactNotFoundException extends RuntimeException {
    public ContactNotFoundException(String contact) {
        super(contact);
    }
}
