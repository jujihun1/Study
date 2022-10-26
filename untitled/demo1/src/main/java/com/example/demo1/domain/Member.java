package com.example.demo1.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


//@Setter @Getter
//@NoArgsConstructor // 생성자
@Entity
@Table (name = "Member")
public class Member {
    // SQL 에서 Long > 정수
    @Id @GeneratedValue // key 자동생성
    private Long id;

    @Column(name = "NAME")
    private String userName;
    
    
    
}
