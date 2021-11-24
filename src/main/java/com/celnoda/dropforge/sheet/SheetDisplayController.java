package com.celnoda.dropforge.sheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.celnoda.dropforge.playercharacter.PlayerCharacterManager;
import com.celnoda.dropforge.playercharacter.Attribute;


@Controller
public class SheetDisplayController {
	
	@Autowired
	PlayerCharacterManager pcManager;

	@RequestMapping(value = "/sheet/create")
	public String navSheetCreate(Model model) {
		
		model.addAttribute("playerAttr", Attribute.getStrings());

		return "/player/sheet/sheet-create";
	}

	@RequestMapping(value = "/sheets", method = RequestMethod.GET)
	public String navSheetList(Model model) {
		
		model.addAttribute("player-characters", pcManager.getPlayerCharacters());
		
		return "/player/sheet/sheets";
	}
	
	@RequestMapping(value = "/sheet/details")
	// @RequestMapping(value = "/sheet/details/{id}")
	public String navSheetDetails(Model model) {
		
		model.addAttribute("name", "Posarios - Rabble of Sloth");
		
		return "/player/sheet/sheet-details";
	}
}
