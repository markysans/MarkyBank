package com.dolan.marky_bank.service.impl;

import com.dolan.marky_bank.entity.NoticeDetails;
import com.dolan.marky_bank.repository.NoticeDetailsRepository;
import com.dolan.marky_bank.service.NoticeDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeDetailsServiceImpl implements NoticeDetailsService {
    private final NoticeDetailsRepository noticeDetailsRepository;

    @Override
    public List<NoticeDetails> findAllActiveNotices() {
        return noticeDetailsRepository.findActiveNotices(LocalDate.now());
    }
}
