package com.example.demo.relation.domain.academy;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AcademyRepository {

    @PersistenceContext
    private EntityManager em;

    public Academy findId(Long id){
        return em.find(Academy.class, id);
    }

    public List<Academy> findAll(){
       return em.createQuery("select a from Academy a",Academy.class).getResultList();
    }

    public List<Academy> findName(String academyName){
        return em.createQuery("select m from Academy m where m.academy.name = :name", Academy.class)
                .setParameter("name", academyName)
                .getResultList();
    }
}
