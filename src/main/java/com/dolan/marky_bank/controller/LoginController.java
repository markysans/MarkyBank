package com.dolan.marky_bank.controller;

import com.dolan.marky_bank.entity.Customer;
import com.dolan.marky_bank.model.CustomerRequest;
import com.dolan.marky_bank.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody CustomerRequest customerRequest) {
        loginService.register(customerRequest);
        return ResponseEntity.ok("User Registered Successfully");
    }

    @PostMapping("/user")
    public ResponseEntity<Object> getUserDetailsAfterLogin(Authentication authentication) {
        return ResponseEntity.ok(loginService.getUserDetailsAfterLogin(authentication));
    }

}
