package com.example.spring_boot_ecommerce.repository;

import com.example.spring_boot_ecommerce.model.product.VariationOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariationOptionRepository extends JpaRepository<VariationOption, Integer> {
}
