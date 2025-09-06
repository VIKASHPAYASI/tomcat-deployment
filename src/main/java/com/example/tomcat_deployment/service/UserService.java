package com.example.tomcat_deployment.service;

import com.example.tomcat_deployment.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This service provides user data for the application.
 * It can be used to get a list of users.
 */
@Service
public class UserService {
    /**
     * Returns a list of all users.
     * In this example, the users are hardcoded.
     * @return a list of User objects
     */
    public List<User> getAllUsers() {
        return List.of(
            new User(1L, "Vikash"),
            new User(2L, "Ajay"),
            new User(3L, "Vinod")
        );
    }
}