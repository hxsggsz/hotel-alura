package com.alura.hotelalura.DTOS;

import com.alura.hotelalura.enums.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestDTO {
  public String name;
  public String lastName;
  public LocalDate birthDate;
  public String nacionality;
  public int phone;
}
