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

    // Address
    @NotEmpty(message = "필수 항목 입니다.")
    private String country;

    @NotEmpty(message = "필수 항목 입니다.")
    private String city;

    @NotEmpty(message = "필수 항목 입니다.")
    private String address1;

    @NotEmpty(message = "필수 항목 입니다.")
    private String address2;

    @NotEmpty(message = "필수 항목 입니다.")
    private String zipcode;

}
