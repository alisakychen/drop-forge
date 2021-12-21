package com.celnoda.dropforge.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.celnoda.dropforge.model.*;
import com.celnoda.dropforge.service.PlayerCharacterManager;


@Controller
@RequestMapping("/sheet")
public class SheetRestController {
	
	@Autowired
	private PlayerCharacterManager pcManager;
	
	@GetMapping(value = "/characters/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PlayerCharacter>> getCharacters(HttpServletRequest request) {

		return new ResponseEntity<>(pcManager.getPlayerCharacters(), HttpStatus.OK);
	}
	
}
