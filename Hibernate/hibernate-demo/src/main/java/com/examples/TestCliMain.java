package com.examples;

import java.util.List;
import java.util.Scanner;

public class TestCliMain {

	public static void main(String[] args) {
		// create 3 main menu options
		Scanner sc = new Scanner(System.in);
		int mainMenu = 0;
		int subMenu = 0;
		// create an instance of DAO
		UserDao dao = new UsersDaoImpl();
		do {
			System.out.println("1: Store 2: Login 3: Show All Users 4: Exit");
			mainMenu = sc.nextInt();
			switch(mainMenu) {
			case 1: 
				System.out.println("storing");
				break;
			case 2: 
				System.out.println("Login screen");
				System.out.println("Enter userid");
				int userId = sc.nextInt();
				System.out.println("Enter password");
				String password = sc.next();
				Users user = null;
				try {
					user = dao.login(userId, password);
					do {
						// create 4 sub menu options
						System.out.println("Hello, "+user.getName()+" welcome below are certain options you can select");
						System.out.println("1: Update Password 2: Update DOB 3: See Your Information 4: Exit");
						subMenu = sc.nextInt();
						switch(subMenu) {
						case 1: 
							System.out.println("update password");
							break;
						case 2: 
							System.out.println("Update DOB");
							break;
					
						case 3: 
							System.out.println("Name = "+user.getName());
							System.out.println("User Id = "+user.getUserId());
							System.out.println("Dob = "+user.getDob());
							break;
						}
					} while(subMenu != 4);
				} catch (CredentialException e) {
					System.err.println(e.getMessage());
				}
				
				break;
			case 3: 
				List<Users> allUsers = dao.getAllUsers();
				allUsers.forEach(u -> 
				  {
					  System.out.println("UserId = "+u.getUserId());
					  System.out.println("Name = "+u.getName());
					  System.out.println("DOB = "+u.getDob());
					  System.out.println("----------------------------------");
				  });
				break;
			}
			
		} while(mainMenu != 3);
		
		sc.close();
		
	}

}
