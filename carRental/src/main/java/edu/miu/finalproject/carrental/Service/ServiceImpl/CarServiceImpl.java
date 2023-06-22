package edu.miu.finalproject.carrental.Service.ServiceImpl;

import edu.miu.finalproject.carrental.Model.Car;
import edu.miu.finalproject.carrental.Repository.CarRepository;
import edu.miu.finalproject.carrental.Service.CarService;
import edu.miu.finalproject.carrental.Model.Car; // import the Car model here. Make sure the path is correct.
import edu.miu.finalproject.carrental.Repository.CarRepository; // import the CarRepository here. Make sure the path is correct.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car); // saving the car in the database
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id); // delete the car with the specified id from the database
    }

    @Override
    public Optional<Car> getCar(Long id) {
        return carRepository.findById(id); // retrieve the car with the specified id from the database
    }
}
