package com.celnoda.dropforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoreDisplayController {
	@GetMapping(value = "/")
	public String getIndexPage() {
	
		return "index";
	}
}
