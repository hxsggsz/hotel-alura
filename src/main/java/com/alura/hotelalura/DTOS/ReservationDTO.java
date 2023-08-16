package com.alura.hotelalura.DTOS;

import com.alura.hotelalura.enums.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {
  public int totalDays;
  public Payment payment;
}
