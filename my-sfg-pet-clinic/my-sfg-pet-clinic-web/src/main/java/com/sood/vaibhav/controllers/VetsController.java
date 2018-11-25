package com.sood.vaibhav.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sood.vaibhav.sfgpetclinic.services.VetService;

@Controller
@RequestMapping("vets")
public class VetsController {

	private final VetService vetService;
	
	
	
	public VetsController(VetService vetService) {
		super();
		this.vetService = vetService;
	}



	@RequestMapping({"","/","/index","/index.html"})
	public String listVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll()); 
		return "vets/index";
	}
	
}
