package com.study.jpatest2.repository;

import com.study.jpatest2.vo.BoardVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoardRepository extends JpaRepository<BoardVO,Long> {

    public BoardVO findByBno(Long bno);

    Page<BoardVO> findAll(Pageable pageable);
}
