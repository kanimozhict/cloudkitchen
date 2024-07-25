package com.example.ecommerce.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticatedRequest {

    private String emailID;
    private String password;
}
