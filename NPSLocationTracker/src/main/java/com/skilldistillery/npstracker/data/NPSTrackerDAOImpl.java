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
		
//		String jpql = "SELECT cust.email FROM Customer cust WHERE cust.firstName = :fName AND cust.lastName = :lName";
//		email = em.createQuery(jpql, String.class)
//				.setParameter("fName", fName)
//				.setParameter("lName", lName)				
//				.getSingleResult(); 
		
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
		return em.createQuery(jpql, NPSLocation.class).getResultList(); 
	} 

}
