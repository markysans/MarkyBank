package com.dolan.marky_bank.service;

import com.dolan.marky_bank.entity.ContactMessages;
import org.springframework.web.bind.annotation.RequestBody;

public interface ContactService {
    ContactMessages saveContactMessages(@RequestBody ContactMessages contactMessages);
}
