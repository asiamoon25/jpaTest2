package com.study.jpatest2;

import com.study.jpatest2.service.BoardService;
import com.study.jpatest2.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaTest2ApplicationTests {

    @Autowired
    MemberService memberService;

    @Autowired
    BoardService boardService;

    @Test
    void contextLoads() {
    }

    @Test
    void 테스트(){
        memberService.findAll();
        System.out.println(memberService.findAll());
    }

    @Test
    void 테스트2(){

        System.out.println(memberService.findByMbrNo(1L));
    }

    @Test
    void board테스트(){
//        System.out.println(memberService.finA());
    }
    @Test
    void 페이지테스트(){
        System.out.println(boardService.paging(1));
    }

}
