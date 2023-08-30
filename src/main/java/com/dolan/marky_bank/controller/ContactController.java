package com.dolan.marky_bank.controller;

import com.dolan.marky_bank.entity.ContactMessages;
import com.dolan.marky_bank.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;
    @GetMapping("/contact")
    public ResponseEntity<Object> getContactInquiryDetails(@RequestBody ContactMessages contactMessages) {
        return ResponseEntity.ok(contactService.saveContactMessages(contactMessages));
    }
}
