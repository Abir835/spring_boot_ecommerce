package com.example.spring_boot_ecommerce.model.paymentEntity;

import com.example.spring_boot_ecommerce.model.productEntity.ProductItem;
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
public class ShippingCartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "cart_id",
            referencedColumnName = "id"
    )
    private ShoppingCart shoppingCart;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "product_item_id",
            referencedColumnName = "id"
    )
    private ProductItem productItem;

}
