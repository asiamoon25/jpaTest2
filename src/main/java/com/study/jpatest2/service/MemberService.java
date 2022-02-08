package com.study.jpatest2.service;

import com.study.jpatest2.repository.BoardRepository;
import com.study.jpatest2.repository.MemberRepository;
import com.study.jpatest2.vo.BoardVO;
import com.study.jpatest2.vo.MemberVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final BoardRepository boardRepository;
    public MemberService(MemberRepository memberRepository, BoardRepository boardRepository) {
        this.memberRepository = memberRepository;
        this.boardRepository = boardRepository;
    }

    public List<MemberVO> findAll(){
        List<MemberVO> members = new ArrayList<>();
        memberRepository.findAll().forEach(e-> members.add(e));
        return members;
    }

    public MemberVO findByMbrNo(Long mbrNo){
        return memberRepository.findByMbrNo(mbrNo);
    }
}
