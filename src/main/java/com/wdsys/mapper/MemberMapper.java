package com.wdsys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wdsys.domain.MemberVO;

public interface MemberMapper {
	
	public int insertMember(MemberVO memberVO); // 회원정보 추가
	
	@Select("SELECT passwd FROM member WHERE email=#{email} ")
	public int checkMember(@Param("email") String email, 
							@Param("passwd") String passwd);
	
	@Select("SELECT COUNT(*) FROM member WHERE email=#{email} ")
	public int countMemberByEmail(String email); // 이메일 중복확인
	
	@Select("SELECT * FROM member WHERE num=#{num} ")
	public MemberVO getMemberByNum(int num); // 회원 1명 정보 가져오기
	
	@Select("SELECT * FROM member WHERE email=#{email} ")
	public MemberVO getMemberByEmail(String email); // 회원 1명 정보 가져오기
	
	@Select("SELECT * FROM member ORDER BY num ASC")
	public List<MemberVO> getMembers(); // 회원정보 모두 가져오기
	
	@Select("SELECT COUNT(*) FROM member")
	public int countMemberAll(); // 회원 수 가져오기
	

	
	
}
