package com.study.jpatest2.repository;

import com.study.jpatest2.vo.MemberVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberVO,Long> {

    MemberVO findByMbrNo(Long mbrNo);

}
