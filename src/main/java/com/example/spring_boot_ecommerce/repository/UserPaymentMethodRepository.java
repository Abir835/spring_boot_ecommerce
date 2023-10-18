package com.example.spring_boot_ecommerce.repository;

import com.example.spring_boot_ecommerce.model.payment.UserPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentMethodRepository extends JpaRepository<UserPaymentMethod, Integer> {
}
