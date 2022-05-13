package com.skilldistillery.npstracker.data;

import java.util.List;

import com.skilldistillery.npstracker.entities.NPSLocation;

public interface NPSTrackerDAO {
	
	NPSLocation findById(int NPSLocationId);
	List<NPSLocation> findAll();

}
