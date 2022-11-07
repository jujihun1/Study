package com.example.demo3.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

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

    private String fileName;

    private String filePath;

    public ImageObject(String fileName, String filePath){
        this.fileName = fileName; // 이미지 이름
        this.filePath = filePath; // 이미지 경로

    }

}
