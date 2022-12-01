package com.example.demo.relation.domain.login;

import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class LoginService {

    private final MemberRepository memberRepository;

    @Transactional
    public List<Member> login(String loginId){
        return memberRepository.findByLoginId(loginId);
//                .stream().filter(m -> m.getPassword().equals(password))
//                .collect(Collectors.toList());
    }
}
