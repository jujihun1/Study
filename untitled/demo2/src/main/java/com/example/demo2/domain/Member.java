package com.example.demo2.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor  // 기본 생성자 만들어준다
@Entity
@Table(name ="Member")
public class Member {

    @Id @GeneratedValue //Entity 가 들어가면 Id가 들어가야함 @GeneratedValue > 자동으로 key 를 찾아줌
    // SQL 에서 Long > 정수
    private Long id;

    @Column(name = "NAME")
    private  String username;

    public Member(String username){
        this.username = username;
    }

//    @Column(name = "AGE")
//    private  Integer age;
//
//    @Column(name = "EMAIL")
//    private  String email;
//        //Column name =
////    @Column(age = "AGE")
////    private Long userAge;
////
////    @Column(email ="EMAIL")
////    private String userEmail;
//
//
//    public Member(String userName, Integer userAge, String userEmail){
//        this.userName = userName;
//        this.age = userAge;
//        this.email = userEmail;
//
//    }

}

// ** [영속성]

// ** 영속 : EntityManager 에 포함된 상태
// ** 비 영속 : EntityManager 에 포함되기전 상태
// ** 준 영속 : EntityManager 에 포함되었 었고, 현재는 포함되지 않은 상태
// ** 삭제 : 삭제된 상태



