package com.study.jpatest2.controller;

import com.study.jpatest2.service.BoardService;
import com.study.jpatest2.vo.BoardVO;
import com.study.jpatest2.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("/api")
@RequestMapping("/api")
@Slf4j
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @Transactional(readOnly = true)
    @Cacheable(key = "#pageable", value = "boardDetail")
    @GetMapping("/board")
    public Page<BoardVO> boardList(Pageable pageable){

        return boardService.findAll(pageable);
    }

    @GetMapping("/board-detail")
    public Map<String,BoardVO> boardDetail(@RequestParam Map<String,String>params){

        Long bno = Long.parseLong(params.get("bno"));

        Map<String,BoardVO> list = new HashMap<>();

        list.put("list",boardService.findByBno(bno));

        return list;
    }
}
