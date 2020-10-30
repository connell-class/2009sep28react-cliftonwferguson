package com.revature.repo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.web.model.Reimbursement;
import com.web.model.User;
import com.web.repo.ReimbursementDao;

public class ReimbursementDaoTest {
	
	private ReimbursementDao rd;
	
	@Before
	public void setup() {
		rd = new ReimbursementDao ();
	}
	
	@Test
	public void findAllTest() {
		List<Reimbursement> reimbursement = rd.findAll();
		assertFalse(reimbursement.size() == 0);
	}
	
	

}
