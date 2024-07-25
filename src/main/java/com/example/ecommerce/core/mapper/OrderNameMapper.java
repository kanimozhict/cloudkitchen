package com.example.ecommerce.core.mapper;

import com.example.ecommerce.core.model.OrderName;
import com.example.ecommerce.persistence.OrderNameEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface OrderNameMapper {

    List<OrderName> toModel(List<OrderNameEntity> entity);
}
