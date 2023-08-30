package com.dolan.marky_bank.repository;

import com.dolan.marky_bank.entity.AccountTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountTransactionRepository extends JpaRepository<AccountTransactions, String> {
    List<AccountTransactions> findByCustomerIdOrderByTransactionDateTimeDesc(Long id);
}
