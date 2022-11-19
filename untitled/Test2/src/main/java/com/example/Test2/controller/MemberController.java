package com.example.Test2.controller;

import com.example.Test2.dto.MemberDto;
import com.example.Test2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("insert")
    public String insert(MemberDto dto){
        return "redirect:/";
    }

    @PostMapping("insert")
    public String create(MemberDto dto){
        memberService.insert(dto);
        return "insert";
    }

}
