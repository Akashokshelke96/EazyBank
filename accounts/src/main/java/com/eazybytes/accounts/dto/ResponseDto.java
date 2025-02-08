package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(
        name ="Response",
        description = "Schema to hold response information"
)
@Data
@NoArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status Code in the response ",example = "200"
    )
    private String statusCode;
    @Schema(
            description = "Status Message in the response ",example = "Request Processed Successfully"
    )
    private String statusMsg;

    public ResponseDto(String status201, String message201) {
        this.statusCode = status201;
        this.statusMsg = message201;
    }
}
