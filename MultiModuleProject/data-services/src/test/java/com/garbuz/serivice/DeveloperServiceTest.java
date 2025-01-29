package com.garbuz.serivice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.garbuz.service.DeveloperService;

public class DeveloperServiceTest {
	
	private DeveloperService service;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.service = new DeveloperService();
	}
	
	@Test
	public void findById() throws Exception {
		Assertions.assertNotNull(service.findById(1L));
		Assertions.assertEquals(1L, service.findById(1L).getId());
	}
	@Test
	public void findById_NullId() throws Exception {
		
		Assertions.assertThrows(Exception.class, ()->{
			service.findById(null);
		});
	}


	
}
