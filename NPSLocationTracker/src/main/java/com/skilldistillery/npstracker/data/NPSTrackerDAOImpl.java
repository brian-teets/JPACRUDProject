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
	public List<NPSLocation> findByKeyword(String keyword) {
		
		String jpql = "SELECT loc FROM NPSLocation WHERE loc.name = :keyword OR loc.state = :keyword OR loc.region = :keyword"
				+ " OR loc.npsDesignation = :keyword OR loc.description = :keyword";
		
		List<NPSLocation> locations = em.createQuery(jpql, NPSLocation.class)
				.setParameter("keyword", keyword)
				.getResultList();   
		
		return locations; 
	} 
	
	@Override
	public List<NPSLocation> findAll() {
		String jpql = "SELECT loc FROM NPSLocation loc";
		List<NPSLocation> locations = em.createQuery(jpql, NPSLocation.class).getResultList();
		return locations;  
	}

	@Override
	public NPSLocation create(NPSLocation location) {
		
		em.persist(location);
		em.flush();
		
		return location; 
	}

	@Override
	public NPSLocation update(NPSLocation location, int id) {
		
		NPSLocation managed =  em.find(NPSLocation.class, id); 
		managed.setName(location.getName());
		managed.setHasVisited(location.isHasVisited()); 
		managed.setDateVisited(location.getDateVisited()); 
		managed.setState(location.getState()); 
		managed.setRegion(location.getRegion()); 
		managed.setNpsDesignation(location.getNpsDesignation()); 
		managed.setDescription(location.getDescription()); 
		
		return managed; 
	}

	@Override
	public Boolean delete(int id) {
		NPSLocation toDelete = em.find(NPSLocation.class, id); 
		
		boolean result = false;
		
		if(toDelete != null) {
			em.remove(toDelete);
			result = ! em.contains(toDelete);
		}
		 
		return result; 
	} 

}
