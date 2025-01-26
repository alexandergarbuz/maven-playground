package com.garbuz.maven01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.garbuz.maven01.dao.DeveloperDao;
import com.garbuz.maven01.model.Developer;
import com.garbuz.maven01.service.ProjectService;

public class ProjectServiceTest {

	
	private ProjectService service;
	private DeveloperDao dao;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		this.service = new ProjectService();
		this.dao = new DeveloperDao();
		this.service.setDao(dao);
	}
	
	@Test
	public void saveDeveloper() throws Exception {
		Developer developer = new Developer();
		developer.setFirstName("Alex");
		developer.setLastName("Garbuz");
		developer.setEmail("alexander.garbuz@gmail.com");
		
		
		this.service.saveDeveloper(developer);
		
		Assertions.assertNotNull(developer.getId());
	}
	
}
