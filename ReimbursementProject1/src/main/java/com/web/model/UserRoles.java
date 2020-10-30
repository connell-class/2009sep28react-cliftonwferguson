package com.web.model;

public class UserRoles {

	/*
	 * CREATE TABLE project1.ers_user_roles (
	ers_user_role_id serial primary key,
	user_role text DEFAULT 'employee'
     );

	 */
	
	private int userroleid;
	private String userrole;
	public int getUserroleid() {
		return userroleid;
	}
	public void setUserroleid(int userroleid) {
		this.userroleid = userroleid;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	@Override
	public String toString() {
		return "UserRoles [userroleid=" + userroleid + ", userrole=" + userrole + "]";
	}
	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRoles(int userroleid, String userrole) {
		super();
		this.userroleid = userroleid;
		this.userrole = userrole;
	}
	
	
	
}
