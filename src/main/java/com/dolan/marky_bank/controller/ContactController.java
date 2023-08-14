package com.dolan.marky_bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact")
    public ResponseEntity<String> getContactInquiryDetails() {
        return ResponseEntity.ok("Here are the details of Bank Contact from DB");
    }
}
