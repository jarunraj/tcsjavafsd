package com.tcs.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class WelcomeController {
	
	@RequestMapping(value = "/go", method = RequestMethod.GET)
	public String method() {
		System.out.println("From WelcomeController...");
		return "welcome";
	}

}
