package com.tcs.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/go")
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String method1() {
		System.out.println("From welcome.jsp"
				+ "");
		return "welcome";
	}
	
	@RequestMapping(value = "second", method = RequestMethod.GET)
	public String method2(Model model) {
		model.addAttribute("course", "JavaFSD");
		System.out.println("From register.jsp");
		return "register";
	}

}
