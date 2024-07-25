package com.example.ecommerce.persistence;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "homecook_user", schema = "practice")
public class HomeCookUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid", nullable = false)
    private Long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String LastName;
    @Column(name = "emailid")
    private String emailId;
    @Column(name = "phonenumber")
    private String phoneNumber;

}
