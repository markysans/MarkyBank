package com.dolan.marky_bank.exception.error;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiError {
    private String code;
    private String message;
}
