package com.example.tomcat_deployment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * This controller handles navigation for the main pages: home and about.
 * It returns the correct HTML page when a user visits a route.
 */
@Controller
public class PageController {
    /**
     * Shows the home page when the user visits '/'.
     * @return the name of the home view
     */
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    /**
     * Shows the home page when the user visits '/home'.
     * @return the name of the home view
     */
    @GetMapping("/home")
    public String homePageAgain() {
        return "home";
    }

    /**
     * Shows the about page when the user visits '/about'.
     * @return the name of the about view
     */
    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
}