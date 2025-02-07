package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class AccountsDto {

    @NotEmpty(message = "Account type cannot be null or empty!")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be null or empty!")
    private String branchAddress;

    @NotEmpty
    @Pattern(regexp = "^$|[0-9]{10}",message = "Account number must be 10 digits!")
    private Long accountNumber;
}
