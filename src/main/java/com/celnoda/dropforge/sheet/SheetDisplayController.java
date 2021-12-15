package com.celnoda.dropforge.sheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.celnoda.dropforge.playercharacter.Attribute;
import com.celnoda.dropforge.playercharacter.PlayerCharacterManager;


@Controller
public class SheetDisplayController {
	
	@Autowired
	private PlayerCharacterManager pcManager;
	
	@GetMapping(value = "/")
	public String getIndexPage() {
	
		return "index";
	}

	
	@RequestMapping(value = "/sheet/create", method = RequestMethod.GET)
	public String navSheetCreate(Model model) {
		
		model.addAttribute("playerAttributes", Attribute.getStrings());

		return "sheet-create";
	}

	@RequestMapping(value = "/sheets", method = RequestMethod.GET)
	public String navSheetList(Model model) {
		
		model.addAttribute("player-characters", pcManager.getPlayerCharacters());
		
		return "sheets";
	}
	
	@RequestMapping(value = "/sheet/details", method = RequestMethod.GET)
	// @RequestMapping(value = "/sheet/details/{id}")
	public String navSheetDetails(Model model) {
		
		model.addAttribute("name", "Posarios - Rabble of Sloth");
		
		return "sheet-details";
	}
}
