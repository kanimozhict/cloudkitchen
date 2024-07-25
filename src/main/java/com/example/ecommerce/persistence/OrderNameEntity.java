package com.example.ecommerce.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "ordername", schema = "practice")
public class OrderNameEntity {
    @Id
    @Column(name = "nameid")
    private Long id;

    @Column(name = "ordername")
    private String name;

}
