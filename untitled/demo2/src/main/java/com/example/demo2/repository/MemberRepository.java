package com.example.demo2.repository;

import com.example.demo2.domain.Member;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository                                           // Entity , ID
public class MemberRepository {
    // 상품정보 // 아이템
    

    @PersistenceContext
    private EntityManager em;


    public void insertMember(Member member){
        em.persist(member);
    }


    public List<Member> findAll(){
      return em.createQuery("select m from Member m", Member.class)
              .getResultList();
    }

    public List<Member> findName(String username) {
        return em.createQuery("select m from Member m where m.username = :name", Member.class)
                .setParameter("name", username)
                .getResultList();     // setParameter ("name" == m.username 를 의미)
    }

    public void deleteMember(String username) {
        List<Member> members = findName(username);

        for(int i = 0; i < members.size(); i++){
            em.remove(members.get(i));
        }
    }
}
