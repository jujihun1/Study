package com.example.demo3.repository;

import com.example.demo3.domain.ImageObject;
import com.example.demo3.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequiredArgsConstructor // final 이 붙어있거나 @Notnull 이 붙어 있는 필드값에 생성자를 자동으로 생성한다
@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;


    public void save(ImageObject product){
        em.persist(product);

    }








}
