package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Database {
	
	static String user="root";
	static String passwd="password";
	public  Connection loading() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		System.out.println("Driver loaded successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sakila",user,passwd);
	              
		System.out.println("Connection build successfully");
		return con;
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return null;
		

	}
}