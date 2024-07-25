package com.example.ecommerce.core.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Order {

    private UUID orderNumber;
    private String name;
    private Long amount;
    private int quantity;
}
