package com.example.ecommerce.persistence.repo;

import com.example.ecommerce.persistence.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends
        JpaRepository<OrderEntity, UUID> {


}
