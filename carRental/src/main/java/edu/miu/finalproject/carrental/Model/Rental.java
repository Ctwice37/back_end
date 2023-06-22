package edu.miu.finalproject.carrental.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "rental")
@Getter
@Setter
@ToString
//@AllArgsConstructor
@NoArgsConstructor
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;
//
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id")
    private Unit unit;

    private LocalDate pickupDate;

    private LocalDate dropoffDate;


    private boolean isPaid;

    // constructors, getters, and setters

    public Rental(Long id, Customer customer, LocalDate pickupDate, LocalDate dropoffDate, boolean isPaid) {
        this.id = id;
        this.customer = customer;
        this.pickupDate = pickupDate;
        this.dropoffDate = dropoffDate;
        this.isPaid = isPaid;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}