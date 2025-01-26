package com.garbuz.maven01.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.garbuz.maven01.dao.DeveloperDao;
import com.garbuz.maven01.model.Developer;

public class ProjectService {

	private static final Logger LOG = LoggerFactory.getLogger(ProjectService.class);
	
	private DeveloperDao dao;
	
	private Date date;
	
	
	public DeveloperDao getDao() {
		return dao;
	}


	public void setDao(DeveloperDao dao) {
		this.dao = dao;
	}


	public void saveDeveloper(final Developer developerToSave) throws Exception {
		LOG.info("Updating developer {}", developerToSave);
		this.dao.saveOrCreateNew(developerToSave);
		if(developerToSave.getId() == null) {
			throw new Exception("Could not save developer");
		}
		LOG.info("Developer {} updated", developerToSave);
	}
	
	public void methodWithoutTestCoverage() {
		LOG.info("This method does not have test coverage");
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
