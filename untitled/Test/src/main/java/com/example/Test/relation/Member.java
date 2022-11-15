package com.example.Test.relation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;
import org.hibernate.mapping.ToOne;

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
    @ManyToOne// 외래키
    private Academy academy;

    public Member(String memberName, Academy academy) {
        this.memberName = memberName;
        this.academy = academy;
    }
}
