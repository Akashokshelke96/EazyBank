package com.eazybytes.accounts.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDto {
    private String statusCode;
    private String statusMsg;

    public ResponseDto(String status201, String message201) {
        this.statusCode = status201;
        this.statusMsg = message201;
    }
}
