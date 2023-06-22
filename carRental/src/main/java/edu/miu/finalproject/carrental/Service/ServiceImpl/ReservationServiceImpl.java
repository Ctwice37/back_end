//package edu.miu.finalproject.carrental.Service.ServiceImpl;
//
//
//import edu.miu.finalproject.carrental.Model.Reservation;
//import edu.miu.finalproject.carrental.Repository.ReservationRepository;
//import edu.miu.finalproject.carrental.Service.ReservationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ReservationServiceImpl implements ReservationService {
//
//    @Autowired
//    private ReservationRepository reservationRepository;
//
//
//    public ReservationServiceImpl(ReservationRepository reservationRepository) {
//        this.reservationRepository = reservationRepository;
//    }
//
//
//
//    public Reservation createReservation(Reservation reservation) {
//
////        reservation.getUnit().addReservationDate(reservation.getPickupDate(), reservation.getDropoffDate());
//
//        return reservationRepository.save(reservation);
//    }
//}
