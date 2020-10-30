package com.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.model.Reimbursement;
import com.web.service.ReimbursementService;

public class ReimbursementDataController {
	
	private ReimbursementService rs;
	
	public ReimbursementDataController(ReimbursementService rs) {
		super();
		this.rs = rs;
	}
	
	public ReimbursementDataController() {
		this(new ReimbursementService());
	}
	
	public void sendAllData(HttpServletResponse res) throws Exception {
		
		res.setContentType("text/json");
		List<Reimbursement> reimbursement = rs.findAll();
		 
			res.getWriter().println(new ObjectMapper().writeValueAsString(reimbursement));
				
			
		}
		
	}


