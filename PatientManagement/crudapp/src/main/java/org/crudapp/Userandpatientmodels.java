package org.crudapp;

import jakarta.persistence.*;

import java.util.Date;

public class Userandpatientmodels {

    // User.java
    @Entity
    @Table(name = "users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true)
        private String username;

        private String email;
        private String password;

        // Getters and setters
    }

    // Patient.java
    @Entity
    @Table(name = "patients")
    public class Patient {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String firstName;
        private String lastName;
        private Date birthDate;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        // Getters and setters
    }

}
