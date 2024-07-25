package com.example.ecommerce.core.mapper;

import com.example.ecommerce.core.model.HomeCookUser;
import com.example.ecommerce.persistence.HomeCookUserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface HomeCookUserMapper {
    List<HomeCookUser> toModel(List<HomeCookUserEntity> entityList);
}
