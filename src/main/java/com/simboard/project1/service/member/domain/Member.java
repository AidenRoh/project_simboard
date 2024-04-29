package com.simboard.project1.service.member.domain;

public class Member {

	private Long member_id;

	private String name;
	private String display_name;
	private int dob;
	private Gender gender;
	private String email;

	public Member(String name, String display_name, int dob, Gender gender, String email) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		if (display_name.isBlank()) {
			this.display_name = name;
		} else {
			this.display_name = display_name;
		}
	}

	public enum Gender {
		MALE,
		FEMAIL,
		PRIVATE
	}
}
