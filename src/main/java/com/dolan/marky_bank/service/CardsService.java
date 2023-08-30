package com.dolan.marky_bank.service;

import com.dolan.marky_bank.entity.Cards;

import java.util.List;

public interface CardsService {
    List<Cards> getCardDetails(Long customerId);
}
