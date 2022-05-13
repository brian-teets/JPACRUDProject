package com.skilldistillery.npstracker.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.npstracker.entities.NPSLocation;

@Service
@Transactional
public class NPSTrackerDAOImpl implements NPSTrackerDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public NPSLocation findById(int NPSLocationId) {
		
		return em.find(NPSLocation.class, NPSLocationId); 
	}

	@Override
	public List<NPSLocation> findAll() {
		// TODO Auto-generated method stub
		return null; 
	}

}
