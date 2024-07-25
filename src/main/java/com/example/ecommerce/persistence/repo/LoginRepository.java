package com.example.ecommerce.persistence.repo;

import com.example.ecommerce.core.model.AuthenticatedRequest;
import com.example.ecommerce.persistence.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginEntity,Integer> {

    LoginEntity findByEmailIdAndPassword(String emailId, String password);
}
