package com.example.demo2.dto;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberDto {
    
    // Member == Entity   Dto가 Member 역할을 수행

    @NonNull
    private String username;

    public MemberDto(String username){
        this.username = username;
    }


}
