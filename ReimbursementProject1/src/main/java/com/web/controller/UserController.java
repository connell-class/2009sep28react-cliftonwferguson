package com.web.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.web.model.User;
import com.web.service.UserService;

public class UserController {
	
	private UserService us;
	
	public UserController(UserService us) {
		super();
		this.us = us;
	}
	
	public UserController() {
		this(new UserService());
	}
	
	public String login(HttpServletRequest req) {
		String userName = req.getParameter("name");
		String userPassword = req.getParameter("password");
		User u = us.findByName(userName, userPassword);
		if(u != null) {
			return "html/reimbursements.html";
		} else {
			return "html/landing.html";
		}
			
		}
	}


