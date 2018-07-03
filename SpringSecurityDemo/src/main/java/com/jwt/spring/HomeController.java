package com.jwt.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/")
	public String welcome(Model model) {
		logger.info("Inside welcome() method");
		model.addAttribute("name", "javawebtutor Spring Security Demo");
		model.addAttribute("description", "unsecured page !");
		return "welcome";

	}

	@RequestMapping(value = "/admin")
	public String adminPage(Model model) {
		logger.info("Inside adminPage() method");
		model.addAttribute("name", "javawebtutor Spring Security Demo");
		model.addAttribute("description", "Protected page !");
		return "admin";

	}

}
