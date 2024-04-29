package com.simboard.project1.service.member.service;

import com.simboard.project1.service.member.domain.Member;
import com.simboard.project1.service.member.dto.MemberSearchCond;
import com.simboard.project1.service.member.dto.MemberUpdateDto;
import java.util.List;
import java.util.Optional;

public interface MemberService {

	Member save(Member member);
	void update(Long memberId, MemberUpdateDto updateParam);
	Optional<Member> findById(Long memberId);
	List<Member> findMembers(MemberSearchCond memberSearch);
	void delete(Long memberId);
}
