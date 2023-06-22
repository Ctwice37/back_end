//package edu.miu.finalproject.carrental.Model;
//
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "reservation")
//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//public class Reservation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    private Customer customer;
//
//    @ManyToOne
//    private Unit unit;
//
//    private LocalDate pickupDate;
//
//    private LocalDate dropoffDate;
//
//    // constructors, getters, and setters
//}