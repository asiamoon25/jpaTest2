package com.study.jpatest2.service;

import com.study.jpatest2.repository.BoardRepository;
import com.study.jpatest2.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class BoardService {
    private final BoardRepository boardRepository;


    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Page<BoardVO> findAll(Pageable pageable){

        return boardRepository.findAll(pageable);
    }

    public BoardVO findByBno(Long bno){

      return  boardRepository.findByBno(bno);
    }
}
