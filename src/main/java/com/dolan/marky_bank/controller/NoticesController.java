package com.dolan.marky_bank.controller;

import com.dolan.marky_bank.service.NoticeDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequiredArgsConstructor
public class NoticesController {
    private final NoticeDetailsService noticeDetailsService;
    @GetMapping("/notices")
    public ResponseEntity<Object> getNotices() {
        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                .body(noticeDetailsService.findAllActiveNotices());
    }
}
