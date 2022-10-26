package com.example.demo1.controller;

import com.example.demo1.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;

//@Controller
@Repository
public class MemberController {

    EntityManager em;

//    @GetMapping("hello")
    public Long insert(Member member) {
        em.persist(member);
        return 1L;
    }


}
