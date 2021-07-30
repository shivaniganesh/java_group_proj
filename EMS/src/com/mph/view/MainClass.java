package com.mph.view;



import java.io.IOException;

import java.util.List;
import java.util.Scanner;
import com.mph.controller.EmployeeController;
import com.mph.exception.UserNotFoundException;



public class MainClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeeController ec = new EmployeeController();
		
		Scanner sc=new Scanner(System.in);
		
		String input=null;
		List elist=null;
		int choice;
		try{
			System.out.println("Welcome to EMS");
			System.out.println("Enter User name");
			String un=sc.next();
			System.out.println("Enter password");
			String pw=sc.next();
			
			String user="shishir",pass="pass";
	
			
	        
			
			if(un.equals(user)&&pw.equals(pass))
			{   System.out.println("Please wait !!...");
				Thread.sleep(3000);
				System.out.println("Login Sucessfully.");
				Thread.sleep(1000);
				System.out.println("Welcome " +  un);	
				
				do {
					System.out.println("Enter your Choice:");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					
					choice = sc.nextInt();

					switch (choice) {
					case 1: {
						elist = ec.addEmployee();

						break;
					}
					case 2: {
						ec.viewEmployee(elist);
						break;
					}

					
					
					default :System.out.println("Please enter valid choice");
						break;
					}
					System.out.println("Do you want to continue? Y or y ");
					input=sc.next();
				}while(input.equals("Y") || input.equals("y"));
				
				System.out.println("Thanks for using this Application! ");
				System.exit(0);
				
			}		
			else
			{
				throw new UserNotFoundException();
			}
			
			}
			catch(UserNotFoundException ude)
			{
				
				ude.printStackTrace();
			}
		
		
		
		
	}
}

