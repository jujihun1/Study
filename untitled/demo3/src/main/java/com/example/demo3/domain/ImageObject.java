package com.example.demo3.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor //일반생성자 자동생성
@Getter
@Entity
// 이미지 클래스
public class ImageObject { //Entity 필드값은 컬럼으로 생성됨

    @Id @GeneratedValue
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "FILENAME")
    private String fileName;

    @Column(name = "FILEPATH")
    private String filePath;

    @Column(name = "COUNT")
    private int count; // 가격 SQL은 int >> Long 로 인식
    @Column(name = "PRICE")
    private int price;



    // method 안의 객체와 필드값이 같게 만들어야함 .
    public ImageObject(String content,
                       String title,
                       int count,
                       int price,
                       String fileName,
                       String filePath)
    {
        this.content = content;
        this.title = title;
        this.count = count;
        this.price = price;
        this.fileName = fileName; // 이미지 이름
        this.filePath = filePath; // 이미지 경로
    }

    public void Test(){ }



}
