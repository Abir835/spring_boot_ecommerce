package com.example.spring_boot_ecommerce.model.paymentEntity;

import com.example.spring_boot_ecommerce.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPaymentMethod {
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
            name = "payment_type_id",
            referencedColumnName = "id"
    )
    private PaymentType paymentType;
    private String provider;
    private String accountNumber;
    private Date expireDate;
    protected Boolean is_default;

}
