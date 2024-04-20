package com.ms.user.dtos;

import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.UniqueElements;

public record UserRecordDTO(@NotBlank String name,
                            @NotBlank @Email String email,
                            @NotBlank
                            String password,
                            String phone
) {
}
