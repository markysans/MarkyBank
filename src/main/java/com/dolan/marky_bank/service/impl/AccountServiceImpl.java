package com.dolan.marky_bank.service.impl;

import com.dolan.marky_bank.entity.Accounts;
import com.dolan.marky_bank.enums.CustomErrorCode;
import com.dolan.marky_bank.exception.MarkyBankException;
import com.dolan.marky_bank.repository.AccountsRepository;
import com.dolan.marky_bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountsRepository accountsRepository;
    @Override
    public Accounts getAccountDetails(String accountNumber) {
        return accountsRepository.findById(accountNumber).orElseThrow(() -> {
            throw new MarkyBankException(CustomErrorCode.NOT_FOUND);
        });
    }
}
