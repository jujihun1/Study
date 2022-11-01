package com.example.demo2.repository;

import com.example.demo2.domain.Member;
import com.example.demo2.dto.MemberDto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository                                           // Entity , ID
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;


    public void insertMember(Member member){
        em.persist(member);
    }


    public List<Member> findAll(){
      return em.createQuery("select m from Member m", Member.class).getResultList();
    }


}
