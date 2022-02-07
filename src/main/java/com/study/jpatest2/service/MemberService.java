package com.study.jpatest2.service;

import com.study.jpatest2.repository.MemberRepository;
import com.study.jpatest2.vo.MemberVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<MemberVO> findAll(){
        List<MemberVO> members = new ArrayList<>();
        memberRepository.findAll().forEach(e-> members.add(e));
        return members;
    }
}
