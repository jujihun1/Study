package com.example.demo.relation.domain.service;


import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.member.MemberRepository;

import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class MemberService {

    private MemberRepository memberRepository;

    public void insert(Member member){
        memberRepository.save(member);
    }


}
