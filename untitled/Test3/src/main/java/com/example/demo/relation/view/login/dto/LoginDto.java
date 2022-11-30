package com.example.demo.relation.view.login.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;


@Data
public class LoginDto {

    @NotEmpty(message = "로그인 ID는 필수입니다")
    private String loginId;

    @NotEmpty(message = "Password를 입력하세요 ")
    private String password;


}
