package com.java.ejb;

import java.io.Serializable;

public class Wallet implements Serializable {
	
	
	private int walletId; 
	private String wallet_Type;
	private int userId;
	private double walletAmount;
	@Override
	public String toString() {
		return "wallet [walletId=" + walletId + ", wallet_Type=" + wallet_Type + ", userId=" + userId
				+ ", walletAmount=" + walletAmount + "]";
	}
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wallet(int walletId, String wallet_Type, int userId, double walletAmount) {
		super();
		this.walletId = walletId;
		this.wallet_Type = wallet_Type;
		this.userId = userId;
		this.walletAmount = walletAmount;
	}
	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public String getWallet_Type() {
		return wallet_Type;
	}
	public void setWallet_Type(String wallet_Type) {
		this.wallet_Type = wallet_Type;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getWalletAmount() {
		return walletAmount;
	}
	public void setWalletAmount(double walletAmount) {
		this.walletAmount = walletAmount;
	}

}
