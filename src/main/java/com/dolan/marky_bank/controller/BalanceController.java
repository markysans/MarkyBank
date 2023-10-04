package com.dolan.marky_bank.controller;

import com.dolan.marky_bank.service.BalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BalanceController {
    private final BalanceService balanceService;
    @GetMapping("/myBalance")
    public ResponseEntity<Object> getBalanceDetails(@RequestParam(value = "customerId")Long customerId) {
        return ResponseEntity.ok(balanceService.getBalanceDetails(customerId));
    }
}
