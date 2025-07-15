package com.cognizant.spring_learn.model;

public class loan {
	private String number;
	private String type;
	private Integer loan;
	private Integer emi;
	private Integer tenure;

	public loan(String number, String type, Integer loan, Integer emi, Integer tenure) {
		this.number = number;
		this.type = type;
		this.loan = loan;
		this.emi = emi;
		this.tenure = tenure;
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

	public Integer getLoan() {
		return loan;
	}

	public void setLoan(Integer loan) {
		this.loan = loan;
	}

	public Integer getEmi() {
		return emi;
	}

	public void setEmi(Integer emi) {
		this.emi = emi;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
}
