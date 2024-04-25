package com.chupapi.chumami.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class ChumamiController {
    // Mapeo a la raíz del sitio
    @GetMapping("/")
    public String showLoginPage(){
        System.out.println("Trata de b...");
        return "index";
    }

    @GetMapping("/chumami")
    public String muestra(){
        System.out.println("Chupapi...");
        return "index";
    }    

    // Método POST para manejar los datos del formulario
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        //TODO: process POST request
        if("admin".equals(username) && "admin".equals(password)){
            model.addAttribute("username", username);
            model.addAttribute("password", password);
            return "success";
        }
        model.addAttribute("errorMessage", "Error mortal");
        return "index";
    }
    
}
