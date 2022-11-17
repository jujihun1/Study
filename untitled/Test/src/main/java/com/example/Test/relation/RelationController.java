package com.example.Test.relation;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Controller
public class RelationController {

    @Autowired
    RelationService relationService;

    @PostMapping("create")
    public String insertMember(RelationDto dto){
        relationService.insertMember(dto);
        return "redirect:/";
    }

    @GetMapping("create")
    public String createMember(){
        return "create";
    }
//    @GetMapping("main")
//    public String insertMember(RelationDto dto){
//
//        Academy academy = new Academy("메가스터디컴퓨터학원");
//        Academy academy1 = new Academy("서면스터디컴퓨터학원");
//        Academy academy2 = new Academy("맥컴퓨터학원");
//        // member 는 academy를 가지고있어서 확인이 가능
//        Member member = new Member("홍길동",academy);
//
//        // academy 는 member 를 가지고 있지않아서 member 값을 academy 에 넣어준다
//        academy1.addMember(member);
//
//        em.persist(member);
//        em.persist(academy);
//        em.persist(academy1);
//        em.persist(academy2);
//
//        return "redirect:/";
//
//    }


}
