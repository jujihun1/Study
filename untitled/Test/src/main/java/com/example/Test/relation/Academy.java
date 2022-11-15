package com.example.Test.relation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Entity
@Getter @Setter
public class Academy {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "academyName")
    private String academyName;

    @OneToMany(mappedBy = "academy")
    private List<Member> members = new ArrayList<>();

    public void addMember(Member member){
        members.add(member);

    }

    public Academy(String academyName) {  // 생성자   @NoArgsConstructor 으로 인해 일반생성자 xx
        this.academyName = academyName;
    }


}




