package com.example.timepasscrud.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class UserDto {

    @Id
    private Long id;

    @NotEmpty
    @Size(min=2, message="user name should have at least 2 characters")
    private String name;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min=8, message="password should have at least 8 characters")
    private String password;
}
