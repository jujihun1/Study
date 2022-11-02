package com.example.demo2.controller;

import com.example.demo2.domain.Member;
import com.example.demo2.dto.MemberDto;
import com.example.demo2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;
    // view 기능
    //    @GetMapping("create") // get 방식은 참조만 가능
    // ==================================================
    // ** 생성
    @GetMapping("new") // 링크이름
    public String newMember(){

        return "new"; // html 이름
    }

    @PostMapping("create") // post 변경가능
    public String createMember(@Valid MemberDto dto){ // @Valid 역할 ? 검증 ?

        memberService.insertMember(dto);
        return "redirect:/";
    }
    // ==================================================
//    @GetMapping("find")
//    public String find(Model model){
//        model.addAttribute("object" , new MemberDto());
//        return "findAll";
//    }

    @GetMapping("findAll") // 링크이름
    public String findAll(Model model){

        List<Member> members = memberService.findAll();
        model.addAttribute("object", members);
        return "findAll"; // html 이름
    }

}
