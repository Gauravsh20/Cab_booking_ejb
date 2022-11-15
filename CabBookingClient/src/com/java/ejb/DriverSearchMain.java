package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DriverSearchMain {

	public static void main(String[] args)  {
	UserBeanRemote service=null;
	
	try {
		service=(UserBeanRemote)new InitialContext().lookup("CabBookingsEAR/UserBean/remote");
	} catch (NamingException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Driver id");
	int id=sc.nextInt();
	try {
		System.out.println(service.searchDriver(id));
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
