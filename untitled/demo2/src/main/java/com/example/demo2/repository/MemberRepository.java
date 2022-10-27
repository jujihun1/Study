package com.example.demo2.repository;


import com.example.demo2.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                           // Entity , ID
public interface MemberRepository extends JpaRepository<Member, Long> {
}
