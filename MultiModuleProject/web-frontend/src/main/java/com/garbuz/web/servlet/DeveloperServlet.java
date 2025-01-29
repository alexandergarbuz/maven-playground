package com.garbuz.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.garbuz.model.Developer;
import com.garbuz.service.DeveloperService;

public class DeveloperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = LoggerFactory.getLogger(DeveloperServlet.class);

	private static final String SUCCESS_URL = "/developer.jsp";
	private static final String ERROR_URL = "/error.jsp";
	private static final String REQUEST_KEY = "currentDeveloper";

	private DeveloperService service = new DeveloperService();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String idParam = request.getParameter("id");
		final Long id = NumberUtils.toLong(idParam);
		String forardUrl = SUCCESS_URL;
		try {
			final Developer developer = service.findById(id);
			request.setAttribute(REQUEST_KEY, developer);
		} catch (Exception e) {
			LOG.error("Cannot display developer: {}", e);
			forardUrl = ERROR_URL;
		}
		request.getRequestDispatcher(forardUrl).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
