package com.studentManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	static Connection con;

	public static Connection createcon(){
		
		try {
			//load driver
			String driver="com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			
			//create connection
			String user="root";
			String pass="Sneha@123";
			String url="jdbc:mysql://localhost:3306/student_management";
			
			con=DriverManager.getConnection(url,user,pass);
			
			
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
