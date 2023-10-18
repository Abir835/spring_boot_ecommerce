package com.example.spring_boot_ecommerce.model.product;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "categoryId",
            referencedColumnName = "id"
    )
    private ProductCategory category;
    private String name;
    private String description;
    private String productImages;

}
