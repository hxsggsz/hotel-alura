package com.alura.hotelalura.controller;

import com.alura.hotelalura.DTOS.GuestDTO;
import com.alura.hotelalura.DTOS.ReservationDTO;
import com.alura.hotelalura.entities.HotelReservation;
import com.alura.hotelalura.repositories.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestRepository guestRepo;

    @PostMapping
    public HotelReservation saveReservation(@RequestBody GuestDTO guest) {

    }
}
