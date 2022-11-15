package com.java.ejb;

import java.io.Serializable;

public class User implements Serializable {
    
	private int userId;
	private String userName;
	private String passCode;
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String mobile;
	private String email;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassCode() {
		return passCode;
	}
	public void setPassCode(String passCode) {
		this.passCode = passCode;
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
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", passCode=" + passCode + ", firstName="
				+ firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state + ", mobile=" + mobile
				+ ", email=" + email + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
				+ ", getPassCode()=" + getPassCode() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getCity()=" + getCity() + ", getState()=" + getState() + ", getMobile()="
				+ getMobile() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
