package com.skilldistillery.npstracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.npstracker.data.NPSTrackerDAOImpl;
import com.skilldistillery.npstracker.entities.NPSLocation;

@Controller
public class NPSTrackerController {
	
	@Autowired
	private NPSTrackerDAOImpl dao;

	
	@RequestMapping(path = {"/", "home.do"}) 
	public String index(Model model) {
		model.addAttribute("locations", dao.findAll()); 
		return "index"; 
	}
	
	@RequestMapping(path = {"getLocation.do"}) 
	public String getLocation(@RequestParam Integer npsid, Model model) {
		NPSLocation location = dao.findById(npsid); 
		model.addAttribute("location", location);  
		return "results/singleLocation"; 
	}
	

}
