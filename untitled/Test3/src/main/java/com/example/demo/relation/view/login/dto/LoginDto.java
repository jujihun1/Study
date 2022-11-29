package com.example.demo.relation.view.login.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;


@Data
public class LoginDto {

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;


}
