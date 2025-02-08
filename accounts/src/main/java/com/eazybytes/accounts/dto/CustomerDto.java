package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer & Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of Customer",example = "Akash Shelke"
    )
    @NotEmpty(message = "Name cannot be null or empty!")
    @Size(min=5, max=30, message = "Name of the customer is not a valid entry!")
    private String name;

    @Schema(
            description = "Email of Customer",example = "akashokshelke@gmail.com"
    )
    @NotEmpty(message = "Email address cannot be null or empty!")
    @Email(message = "Email Address is not a valid email!")
    private String email;

    @Schema(
            description = "Mobile number of Customer",example = "9399403996"
    )
    @NotEmpty(message = "Mobile number cannot be null or empty!")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits!")
    private String mobileNumber;

    @Schema(
            description = "Accounts DTO of Customer"
    )
    @Valid
    private AccountsDto accountsDto;
}
