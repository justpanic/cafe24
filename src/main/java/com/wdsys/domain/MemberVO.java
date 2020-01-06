package com.wdsys.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	private int num;
	private String email;
	private String passwd;
	private String nickname;
	private Date regdate;
}
