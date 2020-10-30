package com.web.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.controller.ReimbursementDataController;
import com.web.controller.UserController;

public class RequestForwarder {
	
	public String routes(HttpServletRequest req) {
	
		switch (req.getRequestURI()){
		case "/Reimbursement/login.page":
			return new UserController().login(req);
		default:
			return "html/landing.html";
		}
		
	}
	
	public void data(HttpServletRequest req, HttpServletResponse res) throws Exception {
		switch(req.getRequestURI()) {
		case "/Reimbursement/all.json":
		new ReimbursementDataController().sendAllData(res);
		}
	}

}
