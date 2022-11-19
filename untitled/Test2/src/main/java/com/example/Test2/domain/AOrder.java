package com.example.Test2.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor // 일반생성자 자동생성
public class AOrder {


    @Id @GeneratedValue // 자동으로 key 값을 찾아줌
    private Long id;

    @Column(name = "orderName")
    private String orderName;

    public AOrder(String orderName){
        this.orderName = orderName;
    }





}
