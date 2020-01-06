package com.wdsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdsys.domain.MemberVO;
import com.wdsys.mapper.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public int insertMember(MemberVO memberVO) {
		return memberMapper.insertMember(memberVO);
	}
	
	public int checkMember(String email, String passwd) {
		int check=-1;
		MemberVO memberVO = memberMapper.getMemberByEmail(email);
		if(memberVO!=null) {
			if(passwd.equals(memberVO.getPasswd())) {check=1;} 
			else {check=0;}
		} else {check=-1;}
				
		return check;
	}
	
	public MemberVO getMember(String email) {
		MemberVO memberVO = memberMapper.getMemberByEmail(email);
		return memberVO;
	}
	
	public List<MemberVO> getMembers(){
		List<MemberVO> memberList = memberMapper.getMembers();
		return memberList;
	}
	
	public int countMemberAll() {
		return memberMapper.countMemberAll();
	}
		
	public boolean isEmailDuplicated(String email) {
		boolean isEmailDuplicated=false;
		int emailCheck=memberMapper.countMemberByEmail(email);
		if(emailCheck>0) {isEmailDuplicated=true;}
		return isEmailDuplicated;
	}
	
}
