package com.study.jpatest2.controller;

import com.study.jpatest2.service.MemberService;
import com.study.jpatest2.vo.MemberVO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("/api")
@RequestMapping("/api")
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/board")
    public Map<String, List<MemberVO>> memberList(){
        Map<String,List<MemberVO>> list = new HashMap<>();
        list.put("list",memberService.findAll());
        return list;
    }
}
