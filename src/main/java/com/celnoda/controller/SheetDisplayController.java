package com.celnoda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SheetDisplayController {

	@RequestMapping(value = "/sheet/create")
	public String navSheetCreate() {
		
		return "/player/sheet/sheet-create";
	}

	@RequestMapping(value = "/sheets")
	public String navSheetList() {
		
		return "/player/sheet/sheets";
	}

	@RequestMapping(value = "/sheet/details")
	public String navSheetDetails(Model model) {
		
		model.addAttribute("name", "Posarios - Rabble of Sloth");
		
		return "/player/sheet/sheet-details";
	}
}
