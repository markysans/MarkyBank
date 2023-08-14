package com.dolan.marky_bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("/myCards")
    public ResponseEntity<String> getCardDetails() {
        return ResponseEntity.ok("Here are the details of my card from DB");
    }
}
