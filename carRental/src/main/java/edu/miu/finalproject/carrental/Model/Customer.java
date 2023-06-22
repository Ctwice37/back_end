package edu.miu.finalproject.carrental.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentCardId")
    private PaymentCard paymentCard;

//    @OneToMany(mappedBy = "customer")
//    private List<Reservation> reservations;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Rental> rentals;

    public Customer(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}