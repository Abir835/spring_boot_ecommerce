package com.example.spring_boot_ecommerce.model.Shipping;

import com.example.spring_boot_ecommerce.enums.Role;
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
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private Role role;
}
