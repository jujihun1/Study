package com.example.demo.relation.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // 링크이름을 / 없애서 Welcome page 가 안나옴
    public String home(){
        return "home";
    }

}
