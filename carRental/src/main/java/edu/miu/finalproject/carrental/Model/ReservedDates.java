//package edu.miu.finalproject.carrental.Model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.validation.constraints.Future;
//import jakarta.validation.constraints.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDate;
//
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//public class ReservedDates {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @NotNull
//    private LocalDate startDate;
//    @NotNull
//    @Future
//    private LocalDate endDate;
//
//    public LocalDate getStartDate() { return startDate; }
//
//    public LocalDate getEndDate() { return endDate; }
//}
