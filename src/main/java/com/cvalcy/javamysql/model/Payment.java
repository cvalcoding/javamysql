package com.cvalcy.javamysql.model;

import java.util.Date;

public class Payment {
	private int customerNumber;
	private String checkNumber;
	private Date paymentDate;
	private double amount;

	public Payment() {
	}

	public Payment(int customerNumber, String checkNumber, Date paymentDate, double amount) {
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public int getCustomerNumber() {
		return this.customerNumber;
	}

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public double getAmount() {
		return this.amount;
	}
}
