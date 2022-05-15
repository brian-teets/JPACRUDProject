package com.skilldistillery.npstracker.data;

import java.util.List;

import com.skilldistillery.npstracker.entities.NPSLocation;

public interface NPSTrackerDAO {
	
	NPSLocation findById(int NPSLocationId);
	List<NPSLocation> findByKeyword(String keyword); 
	List<NPSLocation> findAll();
	NPSLocation create(NPSLocation location); 
	NPSLocation update(NPSLocation location, int id); 
	Boolean delete(int id); 

}
