package edu.miu.finalproject.carrental.Repository;


import edu.miu.finalproject.carrental.Model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {
}
