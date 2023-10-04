package com.dolan.marky_bank.repository;

import com.dolan.marky_bank.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, String> {
}
