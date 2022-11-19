package com.example.Test2.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor // 일반생성자 자동생성
public class Member {
    
    
    @Id @GeneratedValue // 자동으로 key 를 찾아줌
    private Long id;

    @Column(name = "memberName")
    private String memberName;

    @JoinColumn
    @ManyToOne
    private Product product;

    @JoinColumn
    @ManyToOne
    private AOrder aorder;

    public Member(String memberName, Product product, AOrder aorder){
        this.memberName = memberName;
        this.product = product;
        this.aorder = aorder;
    }




}
