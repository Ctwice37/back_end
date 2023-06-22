package edu.miu.finalproject.carrental.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment_card")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PaymentCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentCardId;

    private String cardNumber;

    private String cardHolderName;

    private String expirationDate;

    private String cvv;


    }
