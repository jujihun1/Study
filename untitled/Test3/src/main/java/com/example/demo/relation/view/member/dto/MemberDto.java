package com.example.demo.relation.view.member.dto;

import com.example.demo.relation.domain.member.Address;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotEmpty;


@RequiredArgsConstructor
@Data
public class MemberDto {

    @NotEmpty(message = "필수 항목 입니다.")
    private String loginId;

    @NotEmpty(message = "필수 항목 입니다.")
    private String userEmail;

    @NotEmpty(message = "필수 항목 입니다.")
    private String password;

    @NotEmpty(message = "필수 항목 입니다.")
    private String passwordConfirm;

    @NotEmpty(message = "필수 항목 입니다.")
    private String memberName;

    @NotEmpty(message = "필수 항목 입니다.")
    private String academyName;

    private String address1;
    private String address2;
    private String zipcode;

}
