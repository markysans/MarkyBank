package com.dolan.marky_bank.controller;

import com.dolan.marky_bank.service.CardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardsController {
    private final CardsService cardsService;
    @GetMapping("/myCards")
    public ResponseEntity<Object> getCardDetails(@RequestParam(value = "customerId")Long customerId) {
        return ResponseEntity.ok(cardsService.getCardDetails(customerId));
    }
}
