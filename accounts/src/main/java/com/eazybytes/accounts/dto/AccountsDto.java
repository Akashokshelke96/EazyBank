package com.eazybytes.accounts.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class AccountsDto {

    private String accountType;

    private String branchAddress;

    private Long accountNumber;
}
