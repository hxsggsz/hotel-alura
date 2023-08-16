package com.alura.hotelalura.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "guests")
public class HotelGuest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "date_birth")
  private LocalDate dateBirth;

  private String nationality;
  private int phone;

  @ManyToOne
  @JoinColumn(name = "reservation_id")
  private HotelReservation reservation;

}
