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

    public List<Member> findByLoginId(String loginId) {
        return em.createQuery("select m from Member m where m.loginId = :loginId", Member.class)
                .setParameter("loginId", loginId)
                .getResultList();
    }

    //"select m from Member m join m.academy a where a.academyName = :name" "select m from Member m where m.academyName = :academyName"

//    public List<Member> findByAcademyName(String academyName) {
//        return em.createQuery("select m from Member m join m.academy a where a.academyName = :name", Member.class)
//                .setParameter("name", academyName)
//                .getResultList();
//    }




    public List<Academy> AcademyName(String academyName) {
        return em.createQuery("select a from Academy a where a.academyName = :name", Academy.class)
                .setParameter("name", academyName)
                .getResultList();
    }


}
