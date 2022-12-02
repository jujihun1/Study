package com.example.demo.relation.domain.member;


// ** JPQL 에 관하여 join 문
// Service 중복 제거 id값 학원 중복 값 x
// 람다식 에 관하여
// ** jsbin.com

import com.example.demo.relation.domain.academy.Academy;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Locale;

@Getter
@NoArgsConstructor
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "login_id")
    private String loginId;
    @Column(name = "member_name")
    private String memberName;

    @Column(name = "password")
    private String password;
    @JoinColumn(name = "academy_id")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Academy academy;

    public Member(String loginId, String memberName, String password, Academy academy) {
        this.loginId = loginId;
        this.memberName = memberName;
        this.password = password;
        this.academy = academy;
    }


}
