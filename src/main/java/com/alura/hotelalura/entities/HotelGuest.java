package com.alura.hotelalura.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hotel_guests")
public class HotelGuest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long id;

  public String name;

  @Column(name = "last_name")
  public String lastName;

  @Column(name = "date_birth")
  public LocalDate dateBirth;
  public String nationality;
  public int cellphone;

}
