package com.dolan.marky_bank.repository;

import com.dolan.marky_bank.entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoansRepository extends JpaRepository<Loans, Long> {
    List<Loans> findByCustomerId(Long customerId);

    List<Loans> findByCustomerIdOrderByStartDateDesc(Long customerId);
}
