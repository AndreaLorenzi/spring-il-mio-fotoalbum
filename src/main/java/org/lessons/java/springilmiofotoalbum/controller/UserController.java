package org.lessons.java.springilmiofotoalbum.controller;

import org.lessons.java.springilmiofotoalbum.model.User;
import org.lessons.java.springilmiofotoalbum.repository.UserRepository;
import org.lessons.java.springilmiofotoalbum.security.DatabaseUserDetails;
import org.lessons.java.springilmiofotoalbum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping
    public String index(Authentication authentication, Model model) {
        DatabaseUserDetails principal = (DatabaseUserDetails) authentication.getPrincipal();
        User loggedUser = userRepository.findById(principal.getId()).get();
        model.addAttribute(loggedUser.getFirstName());
        model.addAttribute(loggedUser.getLastName());
        // recupero la lista di users e la passo al model
        model.addAttribute("userList", userService.getUserList());

        return "users/list";
    }
}
