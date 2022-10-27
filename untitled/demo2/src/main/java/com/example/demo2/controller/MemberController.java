package com.example.demo2.controller;

import com.example.demo2.domain.Member;
import com.example.demo2.repository.MemberRepository;
import com.example.demo2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("new")
    public String newMember(){
        return "new";
    }

//    @GetMapping("create") // get 방식은 참조만 가능
    @PostMapping("create") // post 변경가능
    public String createMember(){

        Member member = new Member("홍길동");
        memberRepository.save(member); // save ?

        System.out.println("createMember");
        return "";
    }


}
