package com.skilldistillery.npstracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.npstracker.data.NPSTrackerDAOImpl;

@Controller
public class NPSTrackerController {
	
	@Autowired
	private NPSTrackerDAOImpl dao;
	
	
	@RequestMapping(path = {"/", "home.do"}) 
	public String index(Model model) {
		model.addAttribute("DEBUG", dao.findById(1)); // for initial testing 
		return "index"; 
	}
	

}
