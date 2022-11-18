package com.example.Test.relation;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RelationRepository {

    @PersistenceContext
    EntityManager em;

    public void insertMember(Member member){
        em.persist(member);
    }
    public void insertAcademy(Academy academy){
        em.persist(academy);
    }






}
