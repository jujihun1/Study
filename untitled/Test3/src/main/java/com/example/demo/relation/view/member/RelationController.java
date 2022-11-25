package com.example.demo.relation.view.member;

import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.academy.AcademyRepository;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.member.MemberRepository;
import com.example.demo.relation.domain.service.RelationService;
import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
    private final RelationService relationService;

    private final AcademyRepository academyRepository;

    private final MemberRepository memberRepository;
    @GetMapping("/new")
    public String insert(@ModelAttribute("form") MemberDto dto) {
        return "members/newMemberForm";
    }




    @PostMapping("/new")        // BindResult  오류가 나면 값을 가지고 있음
    public String save(@Valid @ModelAttribute("form") MemberDto dto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "members/newMemberForm";
        }
        List<Academy> academies = academyRepository.findByName(dto.getAcademyName());
        Academy academy = null;

        if (!academies.isEmpty()){
            academy = academies.get(0);
        } else {
            academy = new Academy(dto.getAcademyName());
        }

        List<Member> members = relationService.findByLoginId(dto.getLoginId());
        if (!members.isEmpty()){
            System.out.println("Error Message!");
            return "members/newMemberForm";
        } else {
            relationService.insert(new Member(dto.getLoginId(),
                    dto.getMemberName(),
                    dto.getPassword(),
                    academy));
        }


//        for (Member element: members) {
//            if (element.getLoginId().equals(dto.getLoginId())){
//            } else {
//                memberService.insert(new Member(dto.getLoginId(), dto.getMemberName(), dto.getPassword(), academy));
//            }


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
//        }

        return "redirect:/";
    }
}
