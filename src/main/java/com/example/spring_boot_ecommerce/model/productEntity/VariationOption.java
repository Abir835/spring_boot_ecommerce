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
@Table(name = "VariationOptions")
public class VariationOption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String option_value;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "variationId",
            referencedColumnName = "id"
    )
    private Variation variation;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "product_configurations",
            joinColumns = @JoinColumn(
                    name = "variation_option_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "product_item",
                    referencedColumnName = "id"
            )
    )
    private List<ProductItem> productItems;

}
