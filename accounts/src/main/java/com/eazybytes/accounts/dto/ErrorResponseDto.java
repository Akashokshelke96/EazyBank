package com.eazybytes.accounts.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ErrorResponseDto {
    private HttpStatus status;
    private String apiPath;
    private String errorMessage;
    private LocalDateTime errorTime;

    public ErrorResponseDto(HttpStatus status, String apiPath, String errorMessage, LocalDateTime errorTime) {
        this.status = status;
        this.apiPath= apiPath;
        this.errorMessage = errorMessage;
        this.errorTime = errorTime;
    }
}
