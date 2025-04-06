package com.example.auth.payload.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRquest {

    @NotBlank(message = "Email is required")
    @Email(message =  "Email is invalid")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;
}
