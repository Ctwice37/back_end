package edu.miu.finalproject.carrental.Service.ServiceImpl;

import edu.miu.finalproject.carrental.Model.Unit;

import edu.miu.finalproject.carrental.Repository.CarRepository;
import edu.miu.finalproject.carrental.Service.UnitService;
import edu.miu.finalproject.carrental.Repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class UnitServiceImpl implements UnitService {
    private final UnitRepository unitRepository;
    private final CarRepository carRepository;

    @Autowired
    public UnitServiceImpl(UnitRepository unitRepository, CarRepository carRepository) {
        this.unitRepository = unitRepository;
        this.carRepository = carRepository;
    }

    @Override
    public Unit createUnit(Long carID, Unit unit) {

        carRepository.findById(carID).ifPresent(car -> {
            car.getUnits().add(unit);
        });
        return unitRepository.save(unit);
    }

    @Override
    public void deleteUnit(Long id) {
        unitRepository.deleteById(id);
    }

    @Override
    public Optional<Unit> getUnit(Long id) {
        return unitRepository.findById(id);
    }

    @Override
    public Page<Unit> isAvailable(LocalDate startDate, LocalDate endDate, Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return unitRepository.findAvailableUnits(startDate, endDate, pageable);
    }


}
