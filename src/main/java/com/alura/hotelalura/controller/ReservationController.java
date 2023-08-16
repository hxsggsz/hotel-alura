package com.alura.hotelalura.controller;

import com.alura.hotelalura.DTOS.ReservationDTO;
import com.alura.hotelalura.entities.HotelReservation;
import com.alura.hotelalura.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/reservation")
public class ReservationController {

  @Autowired
  private ReservationRepository reservationRepo;

  @PostMapping
  public HotelReservation saveReservation(@RequestBody ReservationDTO reservation) {
    int reservationPrice = 20 * reservation.totalDays;
    HotelReservation hotelReservation = new HotelReservation(reservation.totalDays, reservationPrice, reservation.payment);
    return reservationRepo.save(hotelReservation);
  }
}
