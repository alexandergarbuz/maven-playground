package com.garbuz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.garbuz.model.Developer;

public class DeveloperService {

	private static final Logger LOG = LoggerFactory.getLogger(DeveloperService.class);
	
	public Developer findById(final Long id) throws Exception {
		if(id == null) {
			throw new Exception("Id cannot be null");
		} 
		Developer developer = new Developer();
		developer.setFirstName("Alex");
		developer.setLastName("Garbuz");
		developer.setEmail("alexander.garbuz@gmail.com");
		developer.setId(id);
		LOG.info("Found developer {}", developer);
		return developer;
	}
	

}
