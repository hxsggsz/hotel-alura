package com.alura.hotelalura.entities;

import com.alura.hotelalura.enums.Payment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hotel_reservation")
public class HotelReservation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long id;

  public int totalDays;
  public double valor;

  @Enumerated(EnumType.STRING)
  public Payment payment;

  public LocalDateTime reservedAt = LocalDateTime.now();

  @OneToMany
  public List<HotelGuest> hotelGuest;
}
