package com.example.Test.relation;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor // final 을 찾아 생성
@Transactional(readOnly = true) // class 전체를 읽기 정용으로 사용하겠다
@Service
public class RelationService {


//    @Autowired
    private final RelationRepository relationRepository;

    @Transactional // 이 메서드만 변경사항을 확인하겠다 .
    public void insertMember(RelationDto dto){
        Academy academy = new Academy(dto.getAcademyName());
        relationRepository.insertMember(new Member(dto.getMemberName(),academy));
        relationRepository.insertAcademy(academy);
    }
//    Academy academy = new Academy("메가스터디컴퓨터학원");
//    Academy academy1 = new Academy("서면스터디컴퓨터학원");
//    Academy academy2 = new Academy("맥컴퓨터학원");
//    // member 는 academy를 가지고있어서 확인이 가능
//    Member member = new Member("홍길동");
//
//    public void addMember(Member member) {
//        members.add(member);
//
//
//        // academy 는 member 를 가지고 있지않아서 member 값을 academy 에 넣어준다
//        academy1.addMember(member);
//    }
}
