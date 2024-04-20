package com.ms.user.dtos;

import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.UniqueElements;

public record UserRecordDTO(@NotBlank(message = "Nome é um campo obrigatório")
                            String name,
                            @NotBlank(message = "Email é um campo obrigatório")
                            @Email
                            String email,

                            @NotBlank(message = "Password é um campo obrigatório")
                            String password,
                            String phone
) {
}
