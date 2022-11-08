package com.example.demo3.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Entity
// 이미지 클래스
public class ImageObject {

    @Id @GeneratedValue
    private Long id;

    private String title;

    private String content;


    @Column(name = "FILENAME")
    private String fileName;

    @Column(name = "FILEPATH")
    private String filePath;

    @Column(name = "COUNT")
    private int count; // 가격 SQL은 int >> Long 로 인식
    @Column(name = "PRICE")
    private int price;


    public ImageObject(String content,
                       String title,
                       String fileName,
                       String filePath,
                       int count,
                       int price){

        this.content = content;
        this.title = title;
        this.count = count;
        this.price = price;
        this.fileName = fileName; // 이미지 이름
        this.filePath = filePath; // 이미지 경로


    }

}
