package com.project.fitnessapp.model;
import jakarta.persistence.Entity;

import org.springframework.stereotype.Indexed;

@Entity
public class User {

    

    private String id;
    private String email;
    private String firstName;
    private String lastName;
}
