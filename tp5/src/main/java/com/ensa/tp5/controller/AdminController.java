package com.ensa.tp5.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ensa.tp5.repository.UserRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    @Secured("ROLE_ADMIN")
    public String adminPanel(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "admin";
    }
}
