package com.kagiya.library_store.controllers;

import com.kagiya.library_store.models.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    
    @RequestMapping("/loginPage")
    public String loginPage(Login login){
        return "login-page";
    }

    @PostMapping("/login")
    public String login(Login login){

        String email = login.getEmail();
        String password = login.getPassword();

        System.out.println(email);
        System.out.println(password);

        return "index";
    }



    
}
