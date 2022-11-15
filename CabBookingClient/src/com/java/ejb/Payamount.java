package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Payamount {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		 UserBeanRemote service=null;
		 String type;
			double phnpayamt=0;
			double ptmamt=0;
			double gpay=0;
		 service=(UserBeanRemote)new InitialContext().lookup("CabBookingsEAR/UserBean/remote");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Booking id");
			int id=sc.nextInt();
			double amt=0;
			int userid=0;
				try {
					Booking book=service.searchbookid(id);
					System.out.println(service.searchbookid(id));
					userid=book.getUserId();
					
					System.out.println(book.getAmt());
					amt=book.getAmt();
					List<Wallet>wall=service.Searchwallet(userid);
					
					for (Wallet wallested: wall) {
						System.out.println("Wallet Type :"+ wallested.getWallet_Type());
						if (wallested.getWallet_Type().equals("PAYTM")) {
							ptmamt = wallested.getWalletAmount();
							System.out.println("Amount : "+ ptmamt);
						}
						if (wallested.getWallet_Type().equals("PHONEPE")) {
							phnpayamt = wallested.getWalletAmount();
							System.out.println("Amount : "+ phnpayamt);
						}
						if (wallested.getWallet_Type().equals("GPAY")) {
							phnpayamt = wallested.getWalletAmount();
							System.out.println("Amount : "+ phnpayamt);
						}
						System.out.println("");
						
					}
				
					} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Select The Wallet Type 1 OR 2");
				int no=sc.nextInt();
				double tol;
				switch(no){
		   		case 1:
		   			tol=phnpayamt-amt;
		   			System.out.println("PHONEPE");
		   			System.out.println(tol);
		   			System.out.println(service.paysuccessfull(userid,tol,"PHONEPE"));
		   			break;
		 
		   		case 2:
		   			
		   			tol=ptmamt-amt;
		   			System.out.println("PAYTM");
		   			System.out.println(tol);
		   			System.out.println(service.paysuccessfull(userid,tol,"PAYTM"));
		   			break;
		   			
		   		case 3:
		   			System.out.println(phnpayamt);
		   			break;
		 

		   		default:
		 
		   			System.out.println("INVALID INPUT");						
		   	}
			}

	private static String String(String wallet_Type) {
		// TODO Auto-generated method stub
		return null;
	}

}
