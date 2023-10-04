package com.dolan.marky_bank.service.impl;

import com.dolan.marky_bank.entity.ContactMessages;
import com.dolan.marky_bank.repository.ContactMessagesRepository;
import com.dolan.marky_bank.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactMessagesRepository contactMessagesRepository;

    @Override
    public ContactMessages saveContactMessages(@RequestBody ContactMessages contactMessages) {
        System.out.println(contactMessages.getContactId());
        return contactMessagesRepository.save(contactMessages);
    }
}
