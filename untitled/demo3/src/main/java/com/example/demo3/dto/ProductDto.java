package com.example.demo3.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
public class ProductDto {

    //    public void title(){   } NoArgsConstructor 로 인해 일반생성자 안만들어도됨



    private int price;

    private String title;

    private String content;

    private int count;









}
