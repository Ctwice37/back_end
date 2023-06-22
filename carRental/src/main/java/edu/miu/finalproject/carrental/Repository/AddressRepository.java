package edu.miu.finalproject.carrental.Repository;


import edu.miu.finalproject.carrental.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
