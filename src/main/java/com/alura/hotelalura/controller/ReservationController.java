package com.alura.hotelalura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

  @GetMapping("/")
  public String test() {
    return "workano";
  }
}
