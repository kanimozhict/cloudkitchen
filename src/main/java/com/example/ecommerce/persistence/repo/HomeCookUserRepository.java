package com.example.ecommerce.persistence.repo;

import com.example.ecommerce.persistence.HomeCookUserEntity;
import com.example.ecommerce.persistence.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeCookUserRepository extends JpaRepository<HomeCookUserEntity,Integer> {
}
