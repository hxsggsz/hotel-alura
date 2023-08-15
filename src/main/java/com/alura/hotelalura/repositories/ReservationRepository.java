package com.alura.hotelalura.repositories;

import com.alura.hotelalura.entities.HotelReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<HotelReservation, Long> {
}
