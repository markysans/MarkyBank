package com.dolan.marky_bank.service;

import com.dolan.marky_bank.entity.AccountTransactions;

import java.util.List;

public interface BalanceService {
    List<AccountTransactions> getBalanceDetails(Long id);
}
