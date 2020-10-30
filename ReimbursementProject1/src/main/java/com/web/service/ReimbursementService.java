package com.web.service;


import com.web.model.Reimbursement;
import com.web.repo.DaoContract;
import com.web.repo.ReimbursementDao;

public class ReimbursementService {
    
	private DaoContract<Reimbursement, Integer> rdao;
	   
	public ReimbursementService(ReimbursementDao rdao) {
		super();
		this.rdao = rdao;
	}
	
	public ReimbursementService() {
		this(new ReimbursementDao());
	}

	public java.util.List<Reimbursement> findAll() {
		return rdao.findAll();
	}

	
}
