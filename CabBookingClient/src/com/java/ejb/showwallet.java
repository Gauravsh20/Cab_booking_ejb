package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class showwallet {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		UserBeanRemote service=null;
		try {
			service=(UserBeanRemote)new InitialContext().lookup("CabBookingsEAR/UserBean/remote");
			List<Wallet>wall=service.showwallet();
			for (Wallet wallested: wall) {
				System.out.println(wallested);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
