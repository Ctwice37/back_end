package edu.miu.finalproject.carrental.Service;

import edu.miu.finalproject.carrental.Model.Unit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.Optional;

public interface UnitService {
    Unit createUnit(Long carID,Unit unit); // method to create unit
    void deleteUnit(Long id); // method to delete unit
    Optional<Unit> getUnit(Long id); // method to get unit details



    Page<Unit> isAvailable(LocalDate startDate, LocalDate endDate, Integer pageNumber, Integer pageSize);
}
