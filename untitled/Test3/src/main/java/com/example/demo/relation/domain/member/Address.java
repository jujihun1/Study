package com.example.demo.relation.domain.member;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Embeddable;
@Data
@Embeddable
@NoArgsConstructor
public class Address {

    @Column(table = "member_address")
    private String address1;

    @Column(table = "member_address")
    private String address2;

    @Column(table = "member_address")
    private String zipcode;

    public Address(String address1, String address2, String zipcode) {
    }
}
