package com.example.demo.domain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("hello") // 링크
    public String hello(Model model){
        Member member = new Member();
        member.setUsername("홍길동");

        model.addAttribute("data", member.getUsername());


        return "hello";  // html 이름이랑 같아야하는지 ?
    }

}
