package com.revature.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class ConnectionUtil {
	{
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private final String url = "jdbc:postgresql://bankclifton.cr3mdvbkdi0b.us-east-2.rds.amazonaws.com"
			+ ":5432/postgres?currentSchema=project1";
	private final String username = "postgres";
	private final String password = "password";

	//to make a singleton
	private static ConnectionUtil instance;

	private ConnectionUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static ConnectionUtil getInstance() {
		if(instance == null) {
			instance = new ConnectionUtil();
		}
		return instance;
	}
	//to create a connection to the db
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
	

//	private final String url = "jdbc:postgresql://bankclifton.cr3mdvbkdi0b.us-east-2.rds.amazonaws.com"
//	+ ":5432/postgres?currentSchema=project1";
//private final String username = "jdbc_worker";
//private final String password = "wasspord";

//	private String url = System.getenv("url");
//	private String password = System.getenv("password");
//	private String username = System.getenv("username");
//	private static ConnectionUtil instance;
//
//	private ConnectionUtil() {
//
//	}
//
//	public static ConnectionUtil getInstance() {
//		if (!Optional.of(instance).isPresent()) {
//			instance = new ConnectionUtil();
//		}
//		return instance;
//	}
//
//	public Connection getConnection() throws SQLException {
//		return DriverManager.getConnection(url, username, password);
//	}

//	
//	{
//		try {
//			Class.forName("org.postgresql.Driver");
//		} catch (ClassNotFoundException e) {
//		  e.printStackTrace();
//	}
//	}
//
//
//	
//
//	private static ConnectionUtil instance;
//
//	private ConnectionUtil() {
//	}
//		public static ConnectionUtil getInstance() {
//			if (instance == null) {
//				instance = new ConnectionUtil();
//			}
//			return instance;
//		}
//		public Connection getConnection() throws SQLException {
//			return DriverManager.getConnection(url, username, password);
//		}

}
