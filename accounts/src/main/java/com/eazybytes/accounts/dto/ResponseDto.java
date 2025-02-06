package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ResponseDto {
    private String statusCode;
    private String statusMsg;

    public ResponseDto(String status201, String message201) {
    }
}
