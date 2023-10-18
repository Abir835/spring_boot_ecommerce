package com.example.spring_boot_ecommerce.repository;

import com.example.spring_boot_ecommerce.model.Shipping.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {
}
