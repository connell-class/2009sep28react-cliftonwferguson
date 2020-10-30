package com.web.model;

public class ReimbursementStatus {

	/*
	 * create table project1.ers_reimbursement_status (
    reimb_status_id serial primary key,
    reimb_status text)
	 */
	
	private int statusid;
	private String status;
	
	public int getStatusid() {
		return statusid;
	}
	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ReimbursementStatus [statusid=" + statusid + ", status=" + status + "]";
	}
	public ReimbursementStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReimbursementStatus(int statusid, String status) {
		super();
		this.statusid = statusid;
		this.status = status;
	}
	
//	 a.reimb_id, a.reimb_author, a.reimb_amount, 
//  b.reimb_status, a.reimb_submitted, c.reimb_type 
	
	public ReimbursementStatus(String status) {
		this.status = status;
	}
	
	
}
