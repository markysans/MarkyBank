package com.dolan.marky_bank.controller;

import com.dolan.marky_bank.entity.Accounts;
import com.dolan.marky_bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    @GetMapping("/myAccount")
    public ResponseEntity<Accounts> getAccountDetails(@RequestParam String accountNumber) {
        return ResponseEntity.ok(accountService.getAccountDetails(accountNumber));
    }
}
