package com.dolan.marky_bank.service.impl;

import com.dolan.marky_bank.entity.AccountTransactions;
import com.dolan.marky_bank.repository.AccountTransactionRepository;
import com.dolan.marky_bank.service.BalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BalanceServiceImpl implements BalanceService {
    private final AccountTransactionRepository accountTransactionRepository;

    @Override
    public List<AccountTransactions> getBalanceDetails(Long id) {
        return accountTransactionRepository.findByCustomerIdOrderByTransactionDateTimeDesc(id);
    }
}
