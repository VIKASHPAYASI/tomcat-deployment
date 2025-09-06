package com.example.tomcat_deployment.controllers;

import com.example.tomcat_deployment.models.User;
import com.example.tomcat_deployment.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * This controller handles requests for the users page.
 * It gets user data from the service and shows it on the users.html page.
 */
@Controller
public class UserController {
    // Service for getting user data
    private final UserService userService;

    /**
     * Creates the controller and injects the user service.
     * @param userService the service to get user data
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Handles GET requests to /users.
     * Adds the user list to the model and returns the users page.
     * @param model the model to pass data to the view
     * @return the name of the users view
     */
    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
}