package com.dolan.marky_bank.service.impl;

import com.dolan.marky_bank.entity.Loans;
import com.dolan.marky_bank.repository.LoansRepository;
import com.dolan.marky_bank.service.LoansService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LoansServiceImpl implements LoansService {
    private final LoansRepository loansRepository;
    @Override
    public List<Loans> getLoanDetails(Long customerId) {
        return loansRepository.findByCustomerIdOrderByStartDateDesc(customerId);
    }
}
