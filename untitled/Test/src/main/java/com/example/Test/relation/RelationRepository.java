package com.example.Test.relation;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class RelationRepository {

    @PersistenceContext
    EntityManager em;

    public void insertMember(Member member,Academy academy){
        em.persist(member);
        em.persist(academy);
    }






}
