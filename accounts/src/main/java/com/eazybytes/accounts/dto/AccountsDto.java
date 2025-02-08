package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Accounts Information"
)
public class AccountsDto {

    @Schema(
            description = "Account type of Customer",example = "Savings"
    )
    @NotEmpty(message = "Account type cannot be null or empty!")
    private String accountType;

    @Schema(
            description = "Branch Address of Customer",example = "New york"
    )
    @NotEmpty(message = "Branch address cannot be null or empty!")
    private String branchAddress;

    @Schema(
            description = "Account number of Customer"
    )
    @NotEmpty
    @Pattern(regexp = "^$|[0-9]{10}",message = "Account number must be 10 digits!")
    private Long accountNumber;
}
