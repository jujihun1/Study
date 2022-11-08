package com.example.demo3.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
public class ProductDto {

    private String title;

    private String content;

    private int count;

    private int price;


    public ProductDto(String content,
                      String title,
                      int count,
                      int price){
        this.content = content;
        this.title = title;
        this.count = count ;
        this.price = price;

    }


}
