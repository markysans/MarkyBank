package com.dolan.marky_bank.controller;

import com.dolan.marky_bank.service.LoansService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoansController {
    private final LoansService loansService;
    @GetMapping("/myLoans")
    public ResponseEntity<Object> getLoanDetails(@RequestParam(value = "customerId")Long customerId) {
        return ResponseEntity.ok(loansService.getLoanDetails(customerId));
    }
}
