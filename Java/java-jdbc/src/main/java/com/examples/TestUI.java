package com.examples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


public class TestUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = DbUtility.establishConnection();
			CallableStatement cstmt = con.prepareCall("{call store_users(?, ?, ?)}");
			System.out.println("Enter name");
			cstmt.setString(1, sc.next());
			System.out.println("Enter dob in dd-MM-yyyy");
			cstmt.setDate(2, Date.valueOf(LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
			System.out.println("Enter password");
			cstmt.setString(3, sc.next());
			int status = cstmt.executeUpdate();
			System.out.println("Row affected : "+status);
			DbUtility.close(con, cstmt, null);
			con.close();
			sc.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
