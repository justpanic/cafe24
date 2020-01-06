package com.wdsys.exone;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
			
	@GetMapping("/")
	public String main() {
		return "main/main";
	}
	
	@GetMapping("/record/recordMain")
	public String recordMain() {
		return "record/recordMain";
	}
	
}
