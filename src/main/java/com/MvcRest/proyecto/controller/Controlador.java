package com.MvcRest.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.MvcRest.proyecto.dao.PersonaDao;
import com.MvcRest.proyecto.implemen.PersonaServiceImpl;
import com.MvcRest.proyecto.model.Persona;

@Controller
public class Controlador {

	@Autowired
	private PersonaServiceImpl servicio;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var personas= servicio.listarPersonas();
		model.addAttribute("personas", personas);
		return "index";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		Persona persona = new Persona();
		model.addAttribute("persona", persona);
		return "add";
	}
	
	@PostMapping("/agregar")
	public String guardar(@ModelAttribute("persona")Persona persona) { 
		servicio.save(persona);
		return "redirect:/";
	}
	
}
