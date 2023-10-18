package com.example.spring_boot_ecommerce.model.product;


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
@Table(name = "PRODUCTCATEGORY")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String categoryName;
    @OneToMany(
            mappedBy = "category"
    )
    private List<Product> products;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "promotion_category",
            joinColumns = @JoinColumn(
                    name = "product_category_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "promotion_id",
                    referencedColumnName = "id"
            )
    )
    private List<Promotion> promotion;
}
