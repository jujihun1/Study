package com.example.Test2.controller;

import com.example.Test2.domain.AOrder;
import com.example.Test2.domain.Member;
import com.example.Test2.domain.Product;
import com.example.Test2.dto.MemberDto;
import com.example.Test2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


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
        List<Member> members = memberService.findById(dto.getLoginId());



        if (!members.isEmpty()){
            return "index";
        } else {
            Product product = new Product(dto.getProductName());
            AOrder aOrder = new AOrder(dto.getOrderName());
            memberService.insert(new Member(dto.getMemberName()
                    ,dto.getLoginId()
                    ,dto.getPassword()
                    ,product,aOrder ),product,aOrder);
        }

        return "insert";
    }

}
