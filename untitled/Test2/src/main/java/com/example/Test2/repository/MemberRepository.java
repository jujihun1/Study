package com.example.Test2.repository;

import com.example.Test2.domain.Member;
import com.example.Test2.domain.AOrder;
import com.example.Test2.domain.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    EntityManager em;


    public void insert(Member member, Product product, AOrder order){
        em.persist(member);
        em.persist(product);
        em.persist(order);
    }

    public List<Member> findById(){

    }



}
