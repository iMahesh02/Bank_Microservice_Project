package com.gyuanaBank.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Cards",
        description = "Schema to hold Cards Information"
)
public class CardsDto {

    @Schema(
            description = "Mobile number of the Card holder",
            example = "0123456789"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Card number",
            example = "012345678900"
    )
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Card number must be 12 digits")
    private String cardNumber;

    @Schema(
            description = "Card type",
            example = "Debit Card"
    )
    private String cardType;

    @Schema(
            description = "Total Limit of the Card",
            example = "1000000"
    )
    private int totalLimit;

    @Schema(
            description = "Amount used via Card",
            example = "5000"
    )
    private int amountUsed;

    @Schema(
            description = "Available amount in the Card",
            example = "50000"
    )
    private int availableAmount;
}
