package com.example.spring_boot_ecommerce.model;

import com.example.spring_boot_ecommerce.model.Shipping.OrderLine;
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
public class UserReview {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "id"
    )
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "ordered_product_id",
            referencedColumnName = "id"
    )
    private OrderLine orderLine;
    private Double ratingValue;
    private String comment;
}
