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
    private  String userName;

    public Member(String userName){
        this.userName = userName;
    }

}
