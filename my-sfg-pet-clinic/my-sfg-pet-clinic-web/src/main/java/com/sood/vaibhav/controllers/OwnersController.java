package com.sood.vaibhav.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sood.vaibhav.sfgpetclinic.services.OwnerService;

@Controller
@RequestMapping("owners")
public class OwnersController {

	private final OwnerService ownerService;
	
	public OwnersController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model) {
		
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
	
}
