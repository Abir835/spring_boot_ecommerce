package com.example.spring_boot_ecommerce.repository;

import com.example.spring_boot_ecommerce.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
