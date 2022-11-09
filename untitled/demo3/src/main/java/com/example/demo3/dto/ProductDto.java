package com.example.demo3.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter @Setter
@NoArgsConstructor
public class ProductDto {

    @NonNull
    private String title;

    private String content;
    @NonNull
    private int count;

    private int price;



//    public void title(){   } NoArgsConstructor 로 인해 일반생성자 안만들어도됨





}
