package com.skilldistillery.npstracker.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nps_location")
public class NPSLocation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String name; 
	@Column(name="has_visited")
	private boolean hasVisited;
	@Column(name="date_visited")
	private LocalDate dateVisited;
	private String state;
	private String region;
	@Column(name="nps_designation")
	private String npsDesignation;
	private String description;
	
	
	public NPSLocation() {}
	
	public NPSLocation(int id, String name, boolean hasVisited, LocalDate dateVisited, String state, String region,
			String npsDesignation, String description) {
		super();
		this.id = id;
		this.name = name;
		this.hasVisited = hasVisited;
		this.dateVisited = dateVisited;
		this.state = state;
		this.region = region;
		this.npsDesignation = npsDesignation;
		this.description = description;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHasVisited() {
		return hasVisited;
	}

	public void setHasVisited(boolean hasVisited) {
		this.hasVisited = hasVisited;
	}


	public LocalDate getDateVisited() {
		return dateVisited;
	}


	public void setDateVisited(LocalDate dateVisited) {
		this.dateVisited = dateVisited;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getNpsDesignation() {
		return npsDesignation;
	}


	public void setNpsDesignation(String npsDesignation) {
		this.npsDesignation = npsDesignation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "NPSLocation [id=" + id + ", name=" + name + ", hasVisited=" + hasVisited + ", dateVisited="
				+ dateVisited + ", state=" + state + ", region=" + region + ", npsDesignation=" + npsDesignation
				+ ", description=" + description + "]"; 
	} 

}
