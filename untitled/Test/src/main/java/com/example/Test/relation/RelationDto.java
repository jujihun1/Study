package com.example.Test.relation;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter @Setter
//@NoArgsConstructor

@Data  // lombok 의 모든것을 사용가능
public class RelationDto {

    private String memberName;

    private String academyName;
}
