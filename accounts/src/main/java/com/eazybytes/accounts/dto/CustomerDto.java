package com.eazybytes.accounts.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDto {

    @NotEmpty(message = "Name cannot be null or empty!")
    @Size(min=5, max=30, message = "Name of the customer is not a valid entry!")
    private String name;

    @NotEmpty(message = "Email address cannot be null or empty!")
    @Email(message = "Email Address is not a valid email!")
    private String email;

    @NotEmpty(message = "Mobile number cannot be null or empty!")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits!")
    private String mobileNumber;

    @Valid
    private AccountsDto accountsDto;
}
