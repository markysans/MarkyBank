package com.dolan.marky_bank.repository;

import com.dolan.marky_bank.entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoansRepository extends JpaRepository<Loans, Long> {
}
