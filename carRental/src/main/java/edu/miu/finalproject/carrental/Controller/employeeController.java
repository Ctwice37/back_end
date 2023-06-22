package edu.miu.finalproject.carrental.Controller;


import edu.miu.finalproject.carrental.Model.Car;
import edu.miu.finalproject.carrental.Model.Customer;
import edu.miu.finalproject.carrental.Model.Rental;
import edu.miu.finalproject.carrental.Model.Unit;
import edu.miu.finalproject.carrental.Service.CarService;
import edu.miu.finalproject.carrental.Service.CustomerService;
import edu.miu.finalproject.carrental.Service.RentalService;
import edu.miu.finalproject.carrental.Service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;



@RestController
@RequestMapping(value = "/carRental/api/employee" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class employeeController {
//
    @Autowired
    private CarService carService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private RentalService rentalService;

    @Autowired
    private UnitService unitService;


    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = {"/addcustomer"})
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer customer1 = new Customer(null, customer.getFirstName(), customer.getLastName());

        return new ResponseEntity<>(customerService.createCustomer(customer1), HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = {"/customers"})
    public ResponseEntity<Page<Customer>> getCustomers(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize) {
        return new ResponseEntity<>(customerService.getCustomers(pageNumber, pageSize), HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = {"/createRental"})
    public ResponseEntity<Rental> createRental(@RequestBody Rental rental){
        Rental rental1 = new Rental(null, rental.getCustomer(), rental.getPickupDate(), rental.getDropoffDate(),
                rental.isPaid());
        return new ResponseEntity<>(rentalService.createRental(rental1), HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/available")
    public ResponseEntity<Page<Unit>> getAvailableUnits(@RequestParam("startDate") LocalDate startDate, @RequestParam("endDate") LocalDate endDate,
                                        @RequestParam(defaultValue = "0") int pageNumber,
                                        @RequestParam(defaultValue = "10") int pageSize
                                        ) {
        return new ResponseEntity<>(unitService.isAvailable(startDate, endDate, pageNumber, pageSize), HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = {"/addUnit/{carId}"})
    public ResponseEntity<Unit> addUnit(@RequestBody Unit unit, @PathVariable Long carId) {
        Unit unit1 = new Unit(null, carService.getCar(carId).get(), unit.getPlateNumber(),
                unit.getMileage(), null, unit.isRented());

        return new ResponseEntity<>(unitService.createUnit(carId, unit1), HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = {"/addCar"})
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        Car car1 = new Car(null, car.getMake(), car.getModel(), car.getYear(), car.getColor(), null, null);

        return new ResponseEntity<>(carService.createCar(car1), HttpStatus.CREATED);
    }


}
