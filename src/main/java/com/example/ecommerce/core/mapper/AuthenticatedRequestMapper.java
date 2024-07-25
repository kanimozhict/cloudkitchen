package com.example.ecommerce.core.mapper;

import com.example.ecommerce.api.CredientialsAuthenticatedDTO;
import com.example.ecommerce.core.model.AuthenticatedRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AuthenticatedRequestMapper {

    AuthenticatedRequest toModel(CredientialsAuthenticatedDTO requestDto);
}
