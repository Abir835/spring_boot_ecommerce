package com.example.spring_boot_ecommerce.model.productEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCTITEM")
public class ProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "id"
    )
    private Product products;
    private String SKU;
    private Integer qtyInStock;
    private String productImage;
    private Double price;

}
