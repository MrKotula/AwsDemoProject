package com.foxminded.aswdemoproject.controller;

import com.foxminded.aswdemoproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private static final String USERS_API = "/users";

    private final UserService userService;

    @GetMapping(USERS_API)
    public String hello(Model model) {
        model.addAttribute("users", userService.findAll());

        return "usersPage";
    }
}
