package com.example.spring_boot_ecommerce.repository;

import com.example.spring_boot_ecommerce.model.payment.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTypeRepository extends JpaRepository<PaymentType, Integer> {
}
