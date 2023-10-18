package com.example.spring_boot_ecommerce.model.payment;

import com.example.spring_boot_ecommerce.model.User;
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
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "id"
    )
    private User user;
}
