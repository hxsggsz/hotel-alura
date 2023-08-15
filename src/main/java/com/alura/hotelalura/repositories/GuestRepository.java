package com.alura.hotelalura.repositories;

import com.alura.hotelalura.entities.HotelGuest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<HotelGuest, Long> {
}
