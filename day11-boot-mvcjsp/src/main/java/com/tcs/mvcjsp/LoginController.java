package com.tcs.mvcjsp;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class LoginController {
	
	@GetMapping("/home")
	public String login(Model model) {
		
		ArrayList<String> products = new ArrayList<>();
		
		products.add("television");
		products.add("laptop");
		products.add("smartphone");
		products.add("smartwatch");
		products.add("smartgoggles");
		
		model.addAttribute("products", products);
		
		return "success";
		
	}
	
}
