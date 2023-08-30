package com.dolan.marky_bank.service;

import com.dolan.marky_bank.entity.Accounts;

public interface AccountService {
    Accounts getAccountDetails(String accountNumber);
}
