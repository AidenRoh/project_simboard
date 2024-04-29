package com.simboard.project1.service.member.dto;

import com.simboard.project1.service.member.domain.Member.Gender;

public class MemberUpdateDto {

	private String display_name;
	private Gender gender;
	private String email;

	public MemberUpdateDto(String display_name, Gender gender, String email) {
		this.display_name = display_name;
		this.gender = gender;
		this.email = email;
	}
}
