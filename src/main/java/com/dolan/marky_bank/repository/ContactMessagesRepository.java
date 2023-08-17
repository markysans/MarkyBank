package com.dolan.marky_bank.repository;

import com.dolan.marky_bank.entity.ContactMessages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessagesRepository extends JpaRepository<ContactMessages, String> {
}
