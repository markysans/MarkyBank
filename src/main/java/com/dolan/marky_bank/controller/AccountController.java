package com.dolan.marky_bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/myAccount")
    public ResponseEntity<String> getAccountDetails() {
        return ResponseEntity.ok("Here are my account details from DB!");
    }
}
