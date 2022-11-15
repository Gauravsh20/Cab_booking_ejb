package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class UserSearchMain {

	public static void main(String[] args) throws NamingException {
	UserBeanRemote service=null;
	
	service=(UserBeanRemote)new InitialContext().lookup("CabBookingEAR/UserBean/remote");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter user id");
	int id=sc.nextInt();
	try {
		System.out.println(service.searchUser(id));
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
