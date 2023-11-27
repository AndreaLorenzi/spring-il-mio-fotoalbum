package org.lessons.java.springilmiofotoalbum.service;

import org.lessons.java.springilmiofotoalbum.model.User;
import org.lessons.java.springilmiofotoalbum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
