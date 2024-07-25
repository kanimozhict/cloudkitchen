package com.example.ecommerce.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "po_tbl", schema = "practice")
public class OrderEntity {

    @Id
    @Column(name = "Ordernumber", nullable = false)
    private UUID orderNumber;

    @Column(name = "ordername")
    private String name;

    @Column(name = "price")
    private Long amount;

    @Column(name = "quantity")
    private int quantity;

}