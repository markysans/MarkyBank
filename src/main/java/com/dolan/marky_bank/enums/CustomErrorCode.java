package com.dolan.marky_bank.enums;

import lombok.Getter;

@Getter
public enum CustomErrorCode {
    NOT_FOUND("MB_001", "Not Found!");
    private String code;
    private String message;
    CustomErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
