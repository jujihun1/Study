package com.example.Test2.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberDto {

    private String memberName;

    private String productName;

    private String orderName;

    private String loginId;

    private String password;
}
