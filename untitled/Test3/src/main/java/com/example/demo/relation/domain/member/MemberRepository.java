package com.example.demo.relation.domain.member;

import com.example.demo.relation.domain.academy.Academy;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public List<Member> findById(String loginId) { // select table(m) from (Entity 이름) m join (Member 필드에 academy) a where a.academyName = :name
        return em.createQuery("select m from Member m where m.loginId = :name", Member.class)
                .setParameter("name", loginId)
                .getResultList();
    }

//    public Member findByLoinId(String loginId) { // select table(m) from (Entity 이름) m join (Member 필드에 academy) a where a.academyName = :name
//        return em.createQuery("select m from Member m where m.userEmail = :email", Member.class)
//                .setParameter("email", loginId)
//                .getResultList();
//    }

}
