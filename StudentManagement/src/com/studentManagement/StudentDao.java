package com.studentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.studentManagement.Student;

public class StudentDao {

	static boolean f=false;
	public static boolean insertStudentToDB(Student st) {
		
		try {
			
			Connection con = ConnectionProvider.createcon();
			
			String q= "insert into student(sname,sphone,scity) values(?,?,?)";
			
			PreparedStatement pst=con.prepareStatement(q);
			
			pst.setString(1, st.getSname());
			pst.setString(2, st.getSphone());
			pst.setString(3, st.getScity());
			
			pst.executeUpdate();
			f=true;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean deleteUser(int userid) {
try {
			
			Connection con = ConnectionProvider.createcon();
			
			String q= "delete from student where sid=?";
			
			PreparedStatement pst=con.prepareStatement(q);
			
			pst.setInt(1, userid);
			
			
			pst.executeUpdate();
			f=true;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static void displayUser() {
		
		try {
		Connection con = ConnectionProvider.createcon();
		
		String q= "select * from student";
		
		Statement st=con.createStatement();
		
		ResultSet set=st.executeQuery(q);
		
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString(4);
			
			
			System.out.println("ID : "+id);
			System.out.println("NAME : "+name);
			System.out.println("PHONE: "+city);
			System.out.println("CITY: "+phone);
			System.out.println("++++++++++++++++++++");
		}
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
