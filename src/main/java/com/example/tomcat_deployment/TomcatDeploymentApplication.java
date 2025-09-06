package com.example.tomcat_deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the main class for starting the Spring Boot application.
 * It launches the embedded Tomcat server and loads all configuration.
 */
@SpringBootApplication
public class TomcatDeploymentApplication {
    /**
     * The main method starts the application.
     * @param args command-line arguments (not usually needed)
     */
    public static void main(String[] args) {
        SpringApplication.run(TomcatDeploymentApplication.class, args);
    }
}