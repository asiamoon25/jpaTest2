package com.study.jpatest2.service;

import com.study.jpatest2.repository.BoardRepository;
import com.study.jpatest2.vo.BoardVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
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
