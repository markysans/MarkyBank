package com.dolan.marky_bank.repository;

import com.dolan.marky_bank.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CardsRepository extends JpaRepository<Cards, Long> {
    List<Cards> findByCustomerId(Long id);
}
