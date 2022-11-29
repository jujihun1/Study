package com.example.demo.relation.view.login;

import com.example.demo.relation.domain.login.LoginService;
import com.example.demo.relation.view.login.dto.LoginDto;
import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("login")
@RequiredArgsConstructor
@Controller
public class LoginController {

    private final LoginService loginService;


    @GetMapping("/login")
    public String login(@ModelAttribute("form") LoginDto dto){
        return "login/loginForm";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("form") LoginDto dto, BindingResult bindingResult){

        return "login/loginForm";
//        return loginService.login(dto.getLoginId());
    }

}
