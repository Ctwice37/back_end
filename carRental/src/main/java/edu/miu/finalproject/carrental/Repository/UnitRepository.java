package edu.miu.finalproject.carrental.Repository;

import edu.miu.finalproject.carrental.Model.Unit;
import edu.miu.finalproject.carrental.Model.Unit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface UnitRepository extends JpaRepository<Unit, Long> {

//    @Query("SELECT u FROM Unit u WHERE NOT EXISTS (SELECT r FROM Rental r WHERE r.unit = u AND ((:startDate BETWEEN r.pickupDate AND r.dropoffDate) OR (:endDate BETWEEN r.pickupDate AND r.dropoffDate)))")
//    Page<Unit> findAvailableUnits(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, Integer pageNumber, Integer pageSize);

    @Query("SELECT u FROM Unit u WHERE NOT EXISTS (SELECT r FROM Rental r WHERE r.unit = u AND ((:startDate BETWEEN r.pickupDate AND r.dropoffDate) OR (:endDate BETWEEN r.pickupDate AND r.dropoffDate)))")
    Page<Unit> findAvailableUnits(LocalDate startDate, LocalDate endDate, Pageable pageable);
}
