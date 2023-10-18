package com.example.spring_boot_ecommerce.repository;

import com.example.spring_boot_ecommerce.model.product.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductItemRepository extends JpaRepository<ProductItem, Integer> {
}
