package com.dolan.marky_bank.exception;

import com.dolan.marky_bank.enums.CustomErrorCode;
import lombok.Getter;

@Getter
public class MarkyBankException extends RuntimeException {

    private String message;
    private String code;
    public MarkyBankException(CustomErrorCode customErrorCode) {
        this.code = customErrorCode.getCode();
        this.message = customErrorCode.getMessage();
    }
}
