package com.login.authentication.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {


   @NotBlank(message = "Nombre no puede estar vacio")
   private String firstname;

   @NotBlank(message = "Apellido no puede estar vacio")
   private String lastName;

   @NotBlank(message = "Correo no puede estar vacio")
   private String email;

   @NotBlank(message = "Contraseña no puede estar vacio")
   private String password;
}
