package com.project.fitnessapp.model;
import jakarta

import org.springframework.stereotype.Indexed;
@Entity
public class User {

    @Id

    private String id;
    private String email;
    private String firstName;
    private String lastName;
}
