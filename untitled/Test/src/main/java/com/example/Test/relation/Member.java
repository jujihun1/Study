package com.example.Test.relation;


 // ** 계층 구조 만들어서 쿼리로 보내는 과정 까지 **

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "memberName")
    private String memberName;

    @JoinColumn
    @ManyToOne// 외래키 다른테이블에 있는 PK 를 연결시켜줌
    private Academy academy;

    public Member(String memberName, Academy academy) {
        this.memberName = memberName;
        this.academy = academy;
    }
}
