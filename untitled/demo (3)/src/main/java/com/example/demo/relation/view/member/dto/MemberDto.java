package com.example.demo.relation.view.member.dto;

import com.example.demo.relation.domain.academy.Academy;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class MemberDto {

//    @NotNull // null 값으로 넣을수 없음
    @NotEmpty // 비어있는 상태로 받을수 없음
    private String loginId;

    @NotEmpty
    private String memberName;

    @NotEmpty
    private String password;



}
