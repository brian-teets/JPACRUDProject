package com.skilldistillery.npstracker.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NPSLocationTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private NPSLocation location;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPANPSTracker"); 
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		location = em.find(NPSLocation.class, 1); 
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		location = null;
	}

	@Test
	@DisplayName("test NPSLocation entity mappings")
	void test_NPSLocation_entity_mappings() {
		assertNotNull(location);
		assertEquals("Rocky Mountain National Park", location.getName());
	}

}
