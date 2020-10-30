package com.web.model;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import javax.print.DocFlavor.BYTE_ARRAY;



public class Reimbursement {

	/*
	 * reimb_id serial primary key,
	reimb_amount integer,
	reimb_submitted timestamp default(now()),
	reimb_resolved  timestamp default(now()),
	reimb_description text,
	reimb_receipt bytea,
	reimb_author integer references public.ers_users(ers_users_id),
	reimb_resolver integer references public.ers_users(ers_users_id),
	reimb_status_id integer references public.ers_reimbursement_status(reimb_status_id),
	reimb_type_id integer references public.ers_reimbursement_type(reimb_type_id)
	 */
	
	private int id;
	private double amount;
	private LocalDateTime submitted;
	private LocalDateTime resolved;
	private String description;
	private byte[] receipt; 
	
	//Use to retrieve data
	private String author;
	private String resolver;
	private String status;
	private String type;
	
	//Use to create, update, and deletion of data
	private int author_id;
	private int resolver_id;
	private int status_id;
	private int type_id;
	
	
	
public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public LocalDateTime getSubmitted() {
		return submitted;
	}



	public void setSubmitted(LocalDateTime submitted) {
		this.submitted = submitted;
	}



	public LocalDateTime getResolved() {
		return resolved;
	}



	public void setResolved(LocalDateTime resolved) {
		this.resolved = resolved;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public byte[] getReceipt() {
		return receipt;
	}



	public void setReceipt(byte[] receipt) {
		this.receipt = receipt;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getResolver() {
		return resolver;
	}



	public void setResolver(String resolver) {
		this.resolver = resolver;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getAuthor_id() {
		return author_id;
	}



	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}



	public int getResolver_id() {
		return resolver_id;
	}



	public void setResolver_id(int resolver_id) {
		this.resolver_id = resolver_id;
	}



	public int getStatus_id() {
		return status_id;
	}



	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}



	public int getType_id() {
		return type_id;
	}



	public void setType_id(int type_id) {
		this.type_id = type_id;
	}



	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", amount=" + amount + ", submitted=" + submitted + ", resolved=" + resolved
				+ ", description=" + description + ", receipt=" + receipt + ", author=" + author + ", resolver="
				+ resolver + ", status=" + status + ", type=" + type + ", author_id=" + author_id + ", resolver_id="
				+ resolver_id + ", status_id=" + status_id + ", type_id=" + type_id + "]";
	}



	public Reimbursement(int id, double amount, LocalDateTime submitted, LocalDateTime resolved, String description,
			byte[] receipt, String author, String resolver, String status, String type, int author_id,
			int resolver_id, int status_id, int type_id) {
		super();
		this.id = id;
		this.amount = amount;
		this.submitted = submitted;
		this.resolved = resolved;
		this.description = description;
		this.receipt = receipt;
		this.author = author;
		this.resolver = resolver;
		this.status = status;
		this.type = type;
		this.author_id = author_id;
		this.resolver_id = resolver_id;
		this.status_id = status_id;
		this.type_id = type_id;
	}



	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}



	//	 a.reimb_id, a.reimb_author, a.reimb_amount, 
//     b.reimb_status, a.reimb_submitted, c.reimb_type 
	public Reimbursement(int int1, String string, int int2, LocalDateTime submitted) {
		super();
		this.id = int1;
		this.author = string;
		this.amount = int2;
		this.submitted = submitted;
		
	}







	public Reimbursement(int int1, double double1, LocalDateTime object, LocalDateTime object2, String string,
			byte[] bytes, int int2, int int3, int int4, int int5) {
		this.id = int1;
		this.amount = double1;
		this.submitted = object;
		this.resolved = object2;
		this.description = string;
		this.receipt = bytes;
		this.author_id = int2;
		this.resolver_id = int3;
		this.status_id = int4;
		this.type_id = int5;
		
		
	}

	
	
	
}
