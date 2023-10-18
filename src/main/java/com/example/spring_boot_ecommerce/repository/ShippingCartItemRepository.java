package com.example.spring_boot_ecommerce.repository;

import com.example.spring_boot_ecommerce.model.payment.ShippingCartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingCartItemRepository extends JpaRepository<ShippingCartItem, Integer> {
}
