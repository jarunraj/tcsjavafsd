package com.tcs.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/home")
	public String invite(Model map) {
		map.addAttribute("location", "Chennai One");
		
		return "registrationform";
	}
	
}
