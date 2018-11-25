package com.sood.vaibhav.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sood.vaibhav.sfgpetclinic.model.Owner;
import com.sood.vaibhav.sfgpetclinic.services.OwnerService;
import com.sood.vaibhav.sfgpetclinic.services.map.AbstractMapService;





@Controller
public class IndexController {

@RequestMapping({"","/"})
	public String Index() {
		return "index";
	}
	
}
