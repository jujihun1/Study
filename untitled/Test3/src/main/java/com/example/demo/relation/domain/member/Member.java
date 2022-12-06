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
@SecondaryTables({
        @SecondaryTable(name = "member_address",pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))})
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "userEmail")
    private String userEmail;
    @Column(name = "member_name")
    private String memberName;

    @Column(name = "password")
    private String password;

    @AttributeOverrides({// Address 클래스 의 변수명    table 이름 member_address Column 이름 address1
            @AttributeOverride(name = "address1",column = @Column(table = "member_address",name = "address1")),
            @AttributeOverride(name = "address2",column = @Column(table = "member_address",name = "address2")),
            @AttributeOverride(name = "zipcode",column = @Column(table = "member_address",name = "zipcode"))})
    private Address address;

    @JoinColumn(name = "academy_id")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Academy academy;

    public Member(String loginId, String memberName, String password,String userEmail,Academy academy, Address address) {
        this.loginId = loginId;
        this.memberName = memberName;
        this.password = password;
        this.userEmail = userEmail;
        this.academy = academy;
        this.address = address;
    }
}
