package com.wdsys.exone;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wdsys.domain.MemberVO;
import com.wdsys.service.MemberService;

@Controller
@RequestMapping(value="/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/join")
	public String insertMember(MemberVO memberVO) {
		
		int num=memberService.countMemberAll();
		if(num==0) {
			memberVO.setNum(0);
		} else {
			memberVO.setNum(num+1);
		}
						
		memberService.insertMember(memberVO);
		
		return "redirect:/";
	
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(
			@RequestParam("email") String email, 
			@RequestParam("passwd")	String passwd,
			HttpSession session, HttpServletResponse response){
		
		int check = memberService.checkMember(email, passwd);
		if(check!=1) {
			String message ="";
			if(check==-1) {
				message="회원정보가 없습니다.";
			} else if(check==0) {
				message="패스워드가 틀립니다.";
			}
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "text/html; charset=UTF-8");
			StringBuilder sb = new StringBuilder();
			sb.append("<script>");
			sb.append("alert('"+message+"');");
			sb.append("</script>");
			
			return new ResponseEntity<String>(sb.toString(), headers, HttpStatus.OK);
		}
		
		MemberVO memberVO = memberService.getMember(email);
		session.setAttribute("email", email);
		session.setAttribute("name", memberVO.getNickname());
		session.setAttribute("member", memberVO);
		
		Cookie cookie = new Cookie("email", email);
		cookie.setMaxAge(60*5);
		cookie.setPath("/");
		response.addCookie(cookie);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "/");// 리다이렉트 경로 위치 지정

		// 리다이렉트일 경우 HttpStatus.Found 지정해야 함		
		return new ResponseEntity<String>(headers, HttpStatus.FOUND);
	}
	
	@GetMapping("/logout")
	public ResponseEntity<String> logout(HttpSession session, 
			HttpServletRequest request, HttpServletResponse response){
		
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("email")) {
					cookie.setMaxAge(0);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
			}
		}
		session.invalidate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "text/html; charset=UTF-8"); 
		StringBuilder sb= new StringBuilder();
		sb.append("<script>");
		sb.append("alert('로그아웃 되었습니다.');");
		sb.append("location.href='/';");
		sb.append("</script>");
		
		return new ResponseEntity<String>(sb.toString(), headers, HttpStatus.OK);
	}
	
	
	
}
