package com.ms.user.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserSaveRequest(
        @NotBlank(message = "nome: can not be blank") String nome,
        @NotBlank(message = "email: can not be blank") @Email(message = "invalid email") String email) {

}
