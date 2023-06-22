package edu.miu.finalproject.carrental.Service.ServiceImpl;


import edu.miu.finalproject.carrental.Model.Customer;
import edu.miu.finalproject.carrental.Model.Rental;

import edu.miu.finalproject.carrental.Repository.RentalRepository;
import edu.miu.finalproject.carrental.Service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RentalServiceImpl implements RentalService {

@Autowired
private RentalRepository rentalRepository;

@Autowired
public RentalServiceImpl(RentalRepository rentalRepository) {
    this.rentalRepository = rentalRepository;
}



    @Override
    public Rental createRental(Rental rental) {
//       for(Rental rental : customer.getRentals()) {                       //if the customer is here to pick up the car
//           if(rental.getPickupDate().isEqual(LocalDate.now())) {          //from a reservation, then the reservation should
//               Unit unit = rental.getUnit();                              //be removed from the unit's reservation list
//               unit.removeReservationDate();

        Rental rental1 = new Rental(null, rental.getCustomer(), rental.getPickupDate(),
                rental.getDropoffDate(), rental.isPaid());


        return rentalRepository.save(rental);
    }


}


