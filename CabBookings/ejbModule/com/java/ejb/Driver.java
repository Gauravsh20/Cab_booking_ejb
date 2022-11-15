package com.java.ejb;

import java.io.Serializable;

public class Driver implements Serializable{
 
	private int driverId;
	private String userName;
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String mobile;
	private String email;
	private String cabType;
	private String passCode;
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	public String getPassCode() {
		return passCode;
	}
	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", city=" + city + ", state=" + state + ", mobile=" + mobile + ", email=" + email
				+ ", cabType=" + cabType + ", passCode=" + passCode + "]";
	}
	
	
}
