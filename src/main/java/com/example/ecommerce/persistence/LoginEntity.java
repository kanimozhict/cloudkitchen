package com.example.ecommerce.persistence;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "login", schema = "practice")
public class LoginEntity {

    @Id
    @Column(name = "loginid", nullable = false)
    private int loginId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "emailid")
    private String emailId;

    @Column(name = "password")
    private String password;
}
