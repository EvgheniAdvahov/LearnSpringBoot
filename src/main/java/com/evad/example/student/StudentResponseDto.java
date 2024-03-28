package com.evad.example.student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record StudentResponseDto(
        @NotEmpty @NotNull
        String firstname,
        @NotEmpty @NotNull
        String lastname,
        @Email(message = "Pattern is not correct")
        String email
) {

}
