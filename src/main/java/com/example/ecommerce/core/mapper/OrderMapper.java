package com.example.ecommerce.core.mapper;

import com.example.ecommerce.core.model.Order;
import com.example.ecommerce.persistence.OrderEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> toModel(List<OrderEntity> entity);

}
