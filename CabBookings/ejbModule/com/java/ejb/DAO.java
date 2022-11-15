package com.java.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
 
	Connection con;
	PreparedStatement ps;
	
	public User searchUser(int userId) throws ClassNotFoundException, SQLException {
		con=ConnectionHelper.getConnection();
		String cmd="select * from userdetails where UserId=?";
		ps=con.prepareStatement(cmd);
		ps.setInt(1, userId);
		ResultSet rs=ps.executeQuery();
		User user=null;
		if(rs.next()) {
			user=new User();
			user.setUserId(rs.getInt(userId));
			user.setFirstName(rs.getString("FirstName"));
			user.setLastName(rs.getString("LastName"));
			user.setCity(rs.getString("City"));
			user.setState(rs.getString("State"));
			user.setEmail(rs.getString("Email"));
			user.setMobile(rs.getString("Mobile"));
			user.setUserName(rs.getString("UserName"));
			user.setPassCode(rs.getString("PassCode"));
		}
		return user;
	}
	
	public Driver searchDriver(int driverId) throws ClassNotFoundException, SQLException {
		con=ConnectionHelper.getConnection();
		String cmd="select * from driverdetails where DriverId=?";
		ps=con.prepareStatement(cmd);
		ps.setInt(1, driverId);
		ResultSet rs=ps.executeQuery();
		Driver driver=null;
		if(rs.next()) {
			driver=new Driver();
			driver.setDriverId(rs.getInt(driverId));
			driver.setFirstName(rs.getString("DriverFirstName"));
			driver.setLastName(rs.getString("DriverLastName"));
			driver.setCity(rs.getString("DriverCity"));
			driver.setState(rs.getString("DriverState"));
			driver.setEmail(rs.getString("DriverEmail"));
			driver.setMobile(rs.getString("DriverMobile"));
			driver.setUserName(rs.getString("DriverUserName"));
			driver.setPassCode(rs.getString("DriverPassword"));
		}
		return driver;
	}
	
	public List<Driver> showDriver() throws ClassNotFoundException, SQLException{
		con=ConnectionHelper.getConnection();
		String cmd="select * from driverdetails";
		ps=con.prepareStatement(cmd);
		ResultSet rs=ps.executeQuery();
		List<Driver> driverList=new ArrayList<Driver>();
		Driver driver=null;
		while(rs.next()) {
			driver=new Driver();
			driver.setDriverId(rs.getInt("DriverId"));
			driver.setFirstName(rs.getString("DriverFirstName"));
			driver.setLastName(rs.getString("DriverLastName"));
			driver.setCity(rs.getString("DriverCity"));
			driver.setState(rs.getString("DriverState"));
			driver.setEmail(rs.getString("DriverEmail"));
			driver.setMobile(rs.getString("DriverMobile"));
			driver.setUserName(rs.getString("DriverUserName"));
			driver.setPassCode(rs.getString("DriverPassword"));
			driverList.add(driver);
		}
		return driverList;
	}
	
	public String addBooking(Booking booking) throws ClassNotFoundException, SQLException {
		con=ConnectionHelper.getConnection();
		String cmd="insert into booking(BookingDate,UserId,DriverId,StartingLocation,EndingLocation,Kilometers,BillAmount) values(?,?,?,?,?,?,?)";
		ps=con.prepareStatement(cmd);
		ps.setDate(1, booking.getBookingDate());
		ps.setInt(2, booking.getUserId());
		ps.setInt(3, booking.getDriverId());
		ps.setString(4, booking.getsLocation());
		ps.setString(5, booking.geteLocation());
		ps.setDouble(6, booking.getKm());
		ps.setDouble(7, booking.getAmt());
		ps.executeUpdate();
		return "Booking Done";
	}
	
	public List<Wallet> Searchwallet(int userid) throws ClassNotFoundException, SQLException{
		con=ConnectionHelper.getConnection();
		String cmd="SELECT * FROM wallet where userId=?";
		ps=con.prepareStatement(cmd);
		ps.setInt(1, userid);
		ResultSet rs=ps.executeQuery();
		List<Wallet> walletlist=new ArrayList<Wallet>();
		Wallet wallet=null;
		while(rs.next()){
			wallet=new Wallet();
			wallet.setWallet_Type(rs.getString("Wallet_Type"));
			wallet.setWalletAmount(rs.getDouble("WalletAmount"));
			walletlist.add(wallet);
		}
		
		return walletlist;
		
	}
	
	public List<Wallet> showwallet() throws ClassNotFoundException, SQLException{
		con=ConnectionHelper.getConnection();
		String cmd="SELECT * FROM wallet";
		ps=con.prepareStatement(cmd);
		ResultSet rs=ps.executeQuery();
		List<Wallet> walletlist=new ArrayList<Wallet>();
		Wallet wallets=null;
		while(rs.next()) {
			wallets=new Wallet();
			wallets.setWalletId(rs.getInt("WalletId"));
			wallets.setWallet_Type(rs.getString("Wallet_Type"));
			wallets.setUserId(rs.getInt("UserId"));
			wallets.setWalletAmount(rs.getDouble("WalletAmount"));
			walletlist.add(wallets);
		}
		return walletlist;
	}
	
	public Booking searchbookid(int bookingid) throws ClassNotFoundException, SQLException {
		con=ConnectionHelper.getConnection();
		String cmd="SELECT * FROM booking where BookingID=?";
		ps=con.prepareStatement(cmd);
		ps.setInt(1, bookingid);
		ResultSet rs=ps.executeQuery();
		Booking booking=null;
		if(rs.next()) {
			booking=new Booking();
			booking.setUserId(rs.getInt("UserId"));
			booking.setAmt(rs.getDouble("BillAmount"));
		}
		return booking;
		
	}
	
	public String paysuccessfull(int userid,double amt,String type) throws ClassNotFoundException, SQLException {
		con=ConnectionHelper.getConnection();
		String cmd="UPDATE wallet SET WalletAmount=? where userId=? and Wallet_Type=?";
		ps=con.prepareStatement(cmd);
		ps.setDouble(1,amt);
		ps.setInt(2, userid);
		ps.setString(3,type);
		ps.executeUpdate();
		return "Successfull";
	}
	
	
}
