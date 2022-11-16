package com.example.Test.relation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationService {


    @Autowired
    RelationRepository relationRepository;


    Academy academy = new Academy("메가스터디컴퓨터학원");
    Academy academy1 = new Academy("서면스터디컴퓨터학원");
    Academy academy2 = new Academy("맥컴퓨터학원");
    // member 는 academy를 가지고있어서 확인이 가능
    Member member = new Member("홍길동", academy);

    public void addMember(Member member) {
        members.add(member);


        // academy 는 member 를 가지고 있지않아서 member 값을 academy 에 넣어준다
        academy1.addMember(member);
    }
}
