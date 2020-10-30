package com.web.model;

public class ReimbursementType {

	private int reimbid;
	private String reimbType;
	
	public int getReimbid() {
		return reimbid;
	}
	public void setReimbid(int reimbid) {
		this.reimbid = reimbid;
	}
	public String getReimbType() {
		return reimbType;
	}
	public void setReimbType(String reimbType) {
		this.reimbType = reimbType;
	}
	@Override
	public String toString() {
		return "ReimbursementType [reimbid=" + reimbid + ", reimbType=" + reimbType + "]";
	}
	public ReimbursementType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReimbursementType(int reimbid, String reimbType) {
		super();
		this.reimbid = reimbid;
		this.reimbType = reimbType;
	}
	
//  a.reimb_id, a.reimb_author, a.reimb_amount, 
//  b.reimb_status, a.reimb_submitted, c.reimb_type 
	
	public ReimbursementType(String reimbType) {
		this.reimbType = reimbType;
	}
	
	
	
}
