package com.mandacarubroker.domain.userswallet;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
 *
 *
 **/
public record RegisterDataTransferObject(
    @NotBlank(message = "The user ID cannot be blank")
    String userId,
    @NotBlank(message = "The type investment ID cannot be blank")
    String typeInvestmentId,
    @Pattern(
        regexp = "[A-Za-z]{4}\\d",
        message = "Symbol must be 4 letters followed by 1 number"
    )
    @NotBlank(message = "The symbol cannot be blank")
    String symbol,
    @NotNull(message = "The amount cannot be null")
    Integer amount,
    @NotNull(message = "The price cannot be null")
    Double price
) {}
