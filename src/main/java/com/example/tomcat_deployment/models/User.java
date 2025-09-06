package com.example.tomcat_deployment.models;

/**
 * This class represents a user with an ID and a name.
 * It is used to store user information in the application.
 */
public class User {
    // The unique ID for the user
    private Long id;
    // The name of the user
    private String name;

    /**
     * Creates a new user with the given ID and name.
     * @param id the user's ID
     * @param name the user's name
     */
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the user's ID.
     * @return the user's ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the user's ID.
     * @param id the new ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the user's name.
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the user's name.
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }
}