package com.dolan.marky_bank.service.impl;

import com.dolan.marky_bank.entity.Cards;
import com.dolan.marky_bank.repository.CardsRepository;
import com.dolan.marky_bank.service.CardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardsServiceImpl implements CardsService {
    private final CardsRepository cardsRepository;
    @Override
    public List<Cards> getCardDetails(Long customerId) {
        return cardsRepository.findByCustomerId(customerId);
    }
}
