package org.lessons.java.springilmiofotoalbum.api;

import jakarta.validation.Valid;
import org.lessons.java.springilmiofotoalbum.model.Contact;
import org.lessons.java.springilmiofotoalbum.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin
public class ContactRestController {

    @Autowired
    ContactService contactService;

    @GetMapping
    public List<Contact> index() {
        return contactService.getContactList();
    }

    @PostMapping
    public Contact create(@Valid @RequestBody Contact contact) {
        return contactService.createContact(contact);
    }

}
