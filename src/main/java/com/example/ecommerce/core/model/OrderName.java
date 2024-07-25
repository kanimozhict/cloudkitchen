package com.example.ecommerce.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderName {

    private Long id;
    private String name;
}
