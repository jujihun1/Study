package com.example.Test2.service;

import com.example.Test2.domain.AOrder;
import com.example.Test2.domain.Member;
import com.example.Test2.domain.Product;
import com.example.Test2.dto.MemberDto;
import com.example.Test2.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class MemberService { // 기능부분

    @Autowired
    MemberRepository memberRepository;


    public void insert(MemberDto dto){
        Product product = new Product(dto.getProductName());
        AOrder aOrder = new AOrder(dto.getOrderName());

        memberRepository.insert(new Member(dto.getMemberName(), product,aOrder)
                ,product,aOrder);
    }

//    public void find(MemberDto dto){
//        Product product = new Product(dto.getProductName());
//        AOrder aOrder = new AOrder(dto.getOrderName());
//        return memberRepository.insert(new Member(dto.getMemberName(),product,aOrder),
//                product,aOrder);
//    }


}
