package com.example.Test2.service;

import com.example.Test2.domain.AOrder;
import com.example.Test2.domain.Member;
import com.example.Test2.domain.Product;
import com.example.Test2.dto.MemberDto;
import com.example.Test2.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional(readOnly = true)
@Service
public class MemberService { // 기능부분

    @Autowired
    MemberRepository memberRepository;

//    @Transactional
//    public void insert(MemberDto dto){
//        Product product = new Product(dto.getProductName());
//        AOrder aOrder = new AOrder(dto.getOrderName());
//
//        memberRepository.insert(new Member(dto.getMemberName()
//                        ,dto.getLoginId()
//                        ,dto.getPassword()
//                        ,product,aOrder ),product,aOrder);
//    }

    @Transactional
    public void insert(Member member,Product product, AOrder aOrder){
        memberRepository.save(member,product,aOrder);
    }

    @Transactional
    public List<Member> findById(String loginId){
        return memberRepository.findById(loginId);
    }


//    public void find(MemberDto dto){
//        Product product = new Product(dto.getProductName());
//        AOrder aOrder = new AOrder(dto.getOrderName());
//        return memberRepository.insert(new Member(dto.getMemberName(),product,aOrder),
//                product,aOrder);
//    }


}
