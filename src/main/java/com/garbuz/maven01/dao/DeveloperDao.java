package com.garbuz.maven01.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.garbuz.maven01.model.Developer;

public class DeveloperDao {
	
	private static final Logger LOG = LoggerFactory.getLogger(DeveloperDao.class);
	
	public Long saveOrCreateNew(Developer developerToSave) {
		final Long id = System.currentTimeMillis();
		developerToSave.setId(id);
		LOG.info("Saved developer {} to data storage", developerToSave);
		return id;
		
	}

}
