package com.dolan.marky_bank.repository;

import com.dolan.marky_bank.entity.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, String> {
}
