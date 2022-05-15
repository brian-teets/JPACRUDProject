package com.skilldistillery.npstracker.controllers;

import java.time.LocalDate;

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
	
	@RequestMapping(path={"createLocation.do"}) 
	public String createLocation(String newLocationName, Model model) {
		NPSLocation createLocation = new NPSLocation();
		createLocation.setName(newLocationName); 
		NPSLocation createdLocation = dao.create(createLocation);
		model.addAttribute("newLocation", createdLocation); // new object not just field 
		return "results/newLocation"; 
	}
	
	@RequestMapping(path={"updateLocation.do"})
	public String updateLocation(int id, String name, String state, String region, // maybe later try adding boolean and date back in 
			String npsDesignation, String description, Model model) {
		NPSLocation updatedLocation = new NPSLocation();
		
		
		updatedLocation.setName(name); // map to variable name on jsp form 
//		updatedLocation.setHasVisited(hasVisited); 
//		updatedLocation.setDateVisited(dateVisited);
		updatedLocation.setState(state);
		updatedLocation.setRegion(region);
		updatedLocation.setNpsDesignation(npsDesignation);
		updatedLocation.setDescription(description); 
		
		NPSLocation showUpdatedLocation = dao.update(updatedLocation, id);
		model.addAttribute("location", showUpdatedLocation); 
		
		return "results/singleLocation"; 
	}
	
	@RequestMapping(path={"updateLocationView.do"})
	public String updateLocationView(@RequestParam("id") int id, Model model) {
		NPSLocation updateViewLocation = dao.findById(id); 
		model.addAttribute("location", updateViewLocation);  // ? 
		return "results/updateLocationView"; 
	}
	
	@RequestMapping(path={"delete.do"})
	public String deleteLocation(@RequestParam("id") int id, Model model) {
		boolean deletedSuccess = dao.delete(id);
		model.addAttribute("deleted", deletedSuccess); 
		
		return "results/deleted";
	}
	

}
