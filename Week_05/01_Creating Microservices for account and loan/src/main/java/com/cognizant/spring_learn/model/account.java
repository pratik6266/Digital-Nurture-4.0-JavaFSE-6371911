package com.cognizant.spring_learn.model;

public class account {

	private String number;
	private String type;
	private Integer balance;

	public account(String number, String type, Integer balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
}
