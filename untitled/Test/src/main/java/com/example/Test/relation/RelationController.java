package com.example.Test.relation;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional(readOnly = true) // 읽기전용
@Controller
public class RelationController {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @GetMapping("main")
    public String insert(){

        Academy academy = new Academy("메가스터디컴퓨터학원");
        Academy academy1 = new Academy("서면스터디컴퓨터학원");
        Academy academy2 = new Academy("맥컴퓨터학원");
        Member member = new Member("홍길동",academy);

        academy1.addMember(member);

        em.persist(member);
        em.persist(academy);
        em.persist(academy1);
        em.persist(academy2);

        return "redirect:/";

    }


}
