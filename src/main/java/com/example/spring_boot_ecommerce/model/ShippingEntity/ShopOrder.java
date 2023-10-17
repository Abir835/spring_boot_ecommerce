package com.example.spring_boot_ecommerce.model.ShippingEntity;

import com.example.spring_boot_ecommerce.model.Address;
import com.example.spring_boot_ecommerce.model.User;
import com.example.spring_boot_ecommerce.model.paymentEntity.UserPaymentMethod;
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
public class ShopOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "id"
    )
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "shipping_address",
            referencedColumnName = "id"
    )
    private Address shippingAddress;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "shipping_method",
            referencedColumnName = "id"
    )
    private ShippingMethod shippingMethod;
    private Integer orderTotal;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "order_status",
            referencedColumnName = "id"
    )
    private OrderStatus orderStatus;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "payment_method_id",
            referencedColumnName = "id"
    )
    private List<UserPaymentMethod> userPaymentMethods;
}
