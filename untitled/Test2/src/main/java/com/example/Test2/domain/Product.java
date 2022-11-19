package com.example.Test2.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Product {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "productName")
    private String productName;

    public Product(String productName){
        this.productName = productName;
    }


}
