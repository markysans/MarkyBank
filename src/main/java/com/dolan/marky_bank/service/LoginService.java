package com.dolan.marky_bank.service;

import com.dolan.marky_bank.entity.Customer;
import com.dolan.marky_bank.model.CustomerRequest;
import org.springframework.security.core.Authentication;

public interface LoginService {
    void register(CustomerRequest customerRequest);

    Customer getUserDetailsAfterLogin(Authentication authentication);
}
