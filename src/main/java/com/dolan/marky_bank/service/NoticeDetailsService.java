package com.dolan.marky_bank.service;

import com.dolan.marky_bank.entity.NoticeDetails;

import java.util.List;

public interface NoticeDetailsService {
    List<NoticeDetails> findAllActiveNotices();
}
