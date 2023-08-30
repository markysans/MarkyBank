package com.dolan.marky_bank.service;

import com.dolan.marky_bank.entity.Cards;
import com.dolan.marky_bank.entity.Loans;

import java.util.List;

public interface LoansService {
    List<Loans> getLoanDetails(Long customerId);
}
