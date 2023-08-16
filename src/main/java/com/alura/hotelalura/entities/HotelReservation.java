package com.alura.hotelalura.entities;

import com.alura.hotelalura.enums.Payment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservations")
public class HotelReservation {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long id;

  @Column(name = "total_days")
  private int totalDays;

  @Column(name = "value_reservation")
  private int valueReservation;

  @Enumerated(EnumType.STRING)
  private Payment payment;

  @Column(name = "reserved_at")
  public LocalDateTime reservedAt = LocalDateTime.now();

  @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<HotelGuest> HotelGuests = new ArrayList<HotelGuest>();

  public HotelReservation (int totalDays, int valueReservation, Payment payment) {
    this.totalDays = totalDays;
    this.valueReservation = valueReservation;
    this.payment = payment;
  }

}
