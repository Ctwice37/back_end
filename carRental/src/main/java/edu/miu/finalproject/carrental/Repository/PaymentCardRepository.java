package edu.miu.finalproject.carrental.Repository;


import edu.miu.finalproject.carrental.Model.PaymentCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentCardRepository extends JpaRepository<PaymentCard, Long> {
}
