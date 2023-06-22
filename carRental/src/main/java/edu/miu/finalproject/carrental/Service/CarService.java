package edu.miu.finalproject.carrental.Service;

import edu.miu.finalproject.carrental.Model.Car;
import edu.miu.finalproject.carrental.Model.Car; // import the Car model here. Make sure the path is correct.
import java.util.Optional;

public interface CarService {
    Car createCar(Car car); // method to create car
    void deleteCar(Long id); // method to delete car
    Optional<Car> getCar(Long id); // method to get car details
}
