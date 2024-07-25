package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(
        "com.example.ecommerce.persistence"
)
@EntityScan(
        "com.example.ecommerce.persistence"
)
@SpringBootApplication(
        scanBasePackages = {
                "com.example.ecommerce",
        }
)
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

}
