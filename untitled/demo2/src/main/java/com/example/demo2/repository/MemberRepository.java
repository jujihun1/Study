package com.example.demo2.repository;

import com.example.demo2.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Repository                                           // Entity , ID
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;


    public void insertMember(Member member){
        em.persist(member);
    }


}
