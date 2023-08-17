package com.dolan.marky_bank.service.impl;

import com.dolan.marky_bank.entity.Customer;
import com.dolan.marky_bank.model.CustomerRequest;
import com.dolan.marky_bank.repository.CustomerRepository;
import com.dolan.marky_bank.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public void register(CustomerRequest customerRequest) {
        Customer customer = mapToCustomerEntity(customerRequest);
        customerRepository.save(customer);
    }

    private Customer mapToCustomerEntity(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setEmail(customerRequest.getEmail());
        customer.setMobileNumber(customerRequest.getMobileNumber());
        customer.setPwd(passwordEncoder.encode(customerRequest.getPwd()));
        customer.setRole("USER");
        return customer;
    }
}
