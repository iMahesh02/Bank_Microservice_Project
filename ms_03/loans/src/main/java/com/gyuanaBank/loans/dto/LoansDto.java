package com.gyuanaBank.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(
        name = "Loans",
        description = "Schema to hold Loans Information"
)
@Data
public class LoansDto {

    @NotEmpty(message = "Mobile number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(description = "Mobile number of customer", example = "4569512580")
    private String mobileNumber;

    @NotEmpty(message = "Loan number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Loan number must be 12 digit")
    @Schema(description = "Loan number of the customer", example = "357489562123")
    private String loanNumber;

    @NotEmpty(message = "Loan type can not be a null or empty")
    @Schema(description = "Type of the loan", example = "Home Loan, Vehicle Loan, etc.")
    private String loanType;

    @Positive(message = "Total loan should be greater than zero")
    @Schema(description = "Total loan amount", example = "1000000")
    private int totalLoan;

    @PositiveOrZero(message = "Amount paid should be greater than zero")
    @Schema(description = "Amount paid", example = "500000")
    private int amountPaid;

    @PositiveOrZero(message = "Outstanding amount should be equal or greater than zero")
    @Schema(description = "Outstanding amount", example = "500000")
    private int outstandingAmount;
}
