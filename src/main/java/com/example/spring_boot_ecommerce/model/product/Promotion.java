package com.example.spring_boot_ecommerce.model.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PROMOTION")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private String discountRate;
    private Date startDate;
    private Date endDate;

    @ManyToMany(mappedBy = "promotion")
    private List<ProductCategory> productCategories;
}
