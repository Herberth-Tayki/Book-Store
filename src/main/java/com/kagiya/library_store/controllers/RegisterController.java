package com.kagiya.library_store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kagiya.library_store.models.User;
import com.kagiya.library_store.repositorys.UserRepository;

@Controller
public class RegisterController {
    
    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/registerAccount")
    public String registerPage(User user){
        return "register-page";
    }


    @PostMapping("/register")
    public String register(User user){

        userRepository.save(user);

        return("index");
    }
}

