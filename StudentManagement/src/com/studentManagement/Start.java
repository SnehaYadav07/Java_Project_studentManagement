package com.studentManagement;

import java.io.IOException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws IOException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to my Application.......");
            
		
		while(true) {
			System.out.println("Press 1 to ADD student ");
			System.out.println("Press 2 to DELETE student ");
			System.out.println("Press 3 to DISPLAY student ");
			System.out.println("Press 4 to EXIST APP ");
			
			int c= Integer.parseInt(sc.nextLine());
			
			if(c==1) {
				//add
				
				System.out.println("Enter student name : ");
				String name=sc.nextLine();
				
				System.out.println("Enter student phone : ");
				String phone=sc.nextLine();
				
				System.out.println("Enter student city : ");
				String city=sc.nextLine();
				
				Student st= new Student(name,phone,city);
				boolean ans=StudentDao.insertStudentToDB(st);
				System.out.println(st);
				
				if(ans) {
					System.out.println("Successfully added....");
				}
				else {
					System.out.println("something went wrong....");
				}
				
			}
			else if(c==2) {
				//delete
				System.out.println("Enter student id : ");
				int id=Integer.parseInt(sc.nextLine());
				boolean ans=StudentDao.deleteUser(id);
				
				if(ans) {
					System.out.println("Successfully deleted....");
				}
				else {
					System.out.println("something went wrong....");
				}
			}
			else if(c==3) {
				//display
				StudentDao.displayUser();
				
			}
			else if(c==4) {
				break;
			}
			else {
				
			}
		}
		System.out.println("Thankyou for using application....");
	}

}
