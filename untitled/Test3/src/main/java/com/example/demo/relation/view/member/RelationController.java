package com.example.demo.relation.view.member;

import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.academy.AcademyRepository;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.member.MemberRepository;
import com.example.demo.relation.domain.service.MemberService;
import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/members")
@RequiredArgsConstructor
@Controller
public class RelationController {
    private final MemberService memberService;

    private final AcademyRepository academyRepository;

    private final MemberRepository memberRepository;
    @GetMapping("/new")
    public String insert(@ModelAttribute("form") MemberDto dto) {
        return "members/newMemberForm";
    }

    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("form") MemberDto dto) {

        Academy academy = new Academy(dto.getAcademyName());

//        memberService.insert(new Member(dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
        List<Member> members = memberService.findByName(dto.getLoginId());

        System.out.println(members);

        // List<Academy> all 아무것도 없음.


        for (Member element: members) {
            if (element.getLoginId().equals(dto.getLoginId())){
                memberService.insert(new Member(dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
            } else {
                memberService.insert(new Member(dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
            }


//         List<Academy> all 아무것도 없음.
//        for (Academy element : all) {
//            if(element.getAcademyName().equals(dto.getAcademyName())) {
//                Academy academy = academyRepository.findById(element.getId());
//                memberService.insert(
//                        new Member(dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
//            }
//            else
//            {
//                Academy academy = new Academy(dto.getAcademyName());
//                memberService.insert(
//                        new Member(dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
//            }
        }

        return "redirect:/";
    }
}
