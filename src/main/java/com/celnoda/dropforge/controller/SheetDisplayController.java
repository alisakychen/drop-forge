package com.celnoda.dropforge.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.celnoda.dropforge.model.*;
import com.celnoda.dropforge.service.*;


@Controller
@RequestMapping("/sheet")
public class SheetDisplayController {
	
	@Autowired
	private PlayerCharacterManager pcManager;
	
	@Autowired
	private GameManager gameManager;

	
	@GetMapping(value = "/create")
	public String navSheetCreate(Model model) {
		
		model.addAttribute("playerAttributes", Attribute.getStrings());

		return "sheet-create";
	}

	@RequestMapping(value = "/details" )
	public ModelAndView postSheetDetails(HttpServletRequest request, Model formModel) {
		ModelAndView mav = new ModelAndView("sheet-details");
		String name = request.getParameter("name");
		String desc =  request.getParameter("desc");
		
		if (name.isEmpty()) {
			mav.addObject("error", "Name is required.");
		} else {
			PlayerCharacter character = new PlayerCharacter(name, desc);
			String[] attributeNames = Attribute.getStrings();
			for (String attrName: attributeNames) {
				character.setAttr(attrName.toUpperCase(), Integer.parseInt(request.getParameter(attrName)));
			}
			
			mav.addObject("playerAttributes", attributeNames);
			mav.addObject("character", character);
		}

		return mav;
	}
	
	@GetMapping(value = "/list")
	public ModelAndView navSheetList() {
		List<PlayerCharacter> characters = pcManager.getPlayerCharacters();
		List<Game> games = gameManager.getGames();
		ModelAndView mav = new ModelAndView("sheet-list", "playerCharacters", characters);
		mav.addObject("games", games);

		return mav;
	}
}
