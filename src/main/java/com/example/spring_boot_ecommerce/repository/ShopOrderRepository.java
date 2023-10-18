package com.example.spring_boot_ecommerce.repository;

import com.example.spring_boot_ecommerce.model.Shipping.ShopOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopOrderRepository extends JpaRepository<ShopOrder, Integer> {
}
