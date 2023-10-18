package com.example.spring_boot_ecommerce.repository;

import com.example.spring_boot_ecommerce.model.payment.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
}
