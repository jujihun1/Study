package com.example.demo2.service;

import com.example.demo2.domain.Member;
import com.example.demo2.dto.MemberDto;
import com.example.demo2.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Transactional  // 변경사항 확인
@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;


    public void insertMember(MemberDto dto){
        memberRepository.insertMember(new Member(dto.getUsername()));
    }

    public List<Member> findAll(){
        return memberRepository.findAll();
    }



}
