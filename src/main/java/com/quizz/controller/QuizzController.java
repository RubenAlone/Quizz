package com.quizz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuizzController {

	@RequestMapping(value = "/primera", method = RequestMethod.GET)
	public String primera_get() {
		return "primera";
	}

	@RequestMapping(value = "/primera", method = RequestMethod.POST)
	public String primera_post(Model modelo, @RequestParam String figura) {

		modelo.addAttribute("figura_form", figura);

		return "redirect:/segunda";
	}

	@RequestMapping(value = "/segunda", method = RequestMethod.GET)
	public String segunda_get() {
		return "segunda";
	}

}
