package edu.miu.finalproject.carrental.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "units")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "car_id")

    private Car car;


    @Column(unique = true)
    private String plateNumber;

    private int mileage;


//    @OneToMany
//    private List<ReservedDates> reservedDates;

    @OneToOne(mappedBy = "unit")
//    @JsonBackReference
    @JsonIdentityInfo(
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id")
    private Rental rental;

//    @OneToMany(mappedBy = "unit")
//    private List<Reservation> reservations;



    private boolean isRented;


//    public void addReservationDate(ReservedDates reservationDate) {
//        this.reservedDates.add(reservationDate);
//    }
//    public void removeReservationDate(Integer customerID) { //Remove by customerID...see CustomerServiceImpl
//        this.reservedDates.remove(re);
//    }

}