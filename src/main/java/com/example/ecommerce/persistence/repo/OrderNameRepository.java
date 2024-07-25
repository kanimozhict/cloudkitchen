package com.example.ecommerce.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.persistence.OrderNameEntity;



public interface OrderNameRepository extends
        JpaRepository<OrderNameEntity, Long> {
}
