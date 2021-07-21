package com.codingdojo.spring;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("date", new java.util.Date());
		return "index.jsp";
	}
}
