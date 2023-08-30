package com.dolan.marky_bank.exception;

import com.dolan.marky_bank.exception.error.ApiError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MarkyBankException.class)
    public ResponseEntity<ApiError> handleMarkyBankException(MarkyBankException markyBankException) {
        return ResponseEntity.ok(ApiError.builder()
                        .code(markyBankException.getCode())
                        .message(markyBankException.getMessage())
                        .build());
    }
}
