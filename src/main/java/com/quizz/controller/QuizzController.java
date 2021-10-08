package com.quizz.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//Controlador para guardar las respuestas del usuario.

@Controller
public class QuizzController {

	@RequestMapping(value = "/primera", method = RequestMethod.GET)
	public String primera_get() {
		return "primera";
	}

	@RequestMapping(value = "/primera", method = RequestMethod.POST)
	public String primera_post(Model modelo, @RequestParam String msg, HttpSession httpSession) {

		httpSession.setAttribute("pregunta1", msg);

		return "redirect:/segunda";
	}

	@RequestMapping(value = "/segunda", method = RequestMethod.GET)
	public String segunda_get() {
		return "segunda";
	}

	@RequestMapping(value = "/segunda", method = RequestMethod.POST)
	public String segunda_post(Model modelo, @RequestParam String color, HttpSession httpSession) {

		httpSession.setAttribute("pregunta2", color);

		return "redirect:/tercera";
	}

	@RequestMapping(value = "/tercera", method = RequestMethod.GET)
	public String tercera_get() {
		return "tercera";
	}

	@RequestMapping(value = "/tercera", method = RequestMethod.POST)
	public String tercera_post(Model modelo, @RequestParam String figura, HttpSession httpSession) {

		httpSession.setAttribute("pregunta3", figura);

		return "redirect:/cuarta";
	}

	@RequestMapping(value = "/cuarta", method = RequestMethod.GET)
	public String cuarta_get() {
		return "cuarta";
	}

	@RequestMapping(value = "/cuarta", method = RequestMethod.POST)
	public String cuarta_post(Model modelo, @RequestParam String figura, HttpSession httpSession) {

		httpSession.setAttribute("pregunta4", figura);

		return "redirect:/quinta";
	}

	@RequestMapping(value = "/quinta", method = RequestMethod.GET)
	public String quinta_get() {
		return "quinta";
	}

	@RequestMapping(value = "/quinta", method = RequestMethod.POST)
	public String quinta_post(Model modelo, @RequestParam String figura, HttpSession httpSession) {

		httpSession.setAttribute("pregunta5", figura);

		return "redirect:/sexta";
	}

	@RequestMapping(value = "/sexta", method = RequestMethod.GET)
	public String sexta_get() {
		return "sexta";
	}

	@RequestMapping(value = "/sexta", method = RequestMethod.POST)
	public String sexta_post(Model modelo, @RequestParam String figura, HttpSession httpSession) {

		httpSession.setAttribute("pregunta6", figura);

		return "redirect:/septima";
	}

	@RequestMapping(value = "/septima", method = RequestMethod.GET)
	public String septima_get() {
		return "septima";
	}

	@RequestMapping(value = "/septima", method = RequestMethod.POST)
	public String septima_post(Model modelo, @RequestParam String figura, HttpSession httpSession) {

		httpSession.setAttribute("pregunta7", figura);

		return "redirect:/resultado";
	}

}




