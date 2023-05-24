package com.bookitaka.NodeulProject.member.repository;

import com.bookitaka.NodeulProject.member.dto.UserResponseDTO;
import com.bookitaka.NodeulProject.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface MemberRepository extends JpaRepository<Member, Integer> {

  boolean existsByMemberEmail(String memberEmail);

  Member findByMemberEmail(String memberEmail);

  @Transactional
  void deleteByMemberEmail(String memberEmail);

  boolean updateMember(String memberEmail, UserResponseDTO userResponseDTO);

}
