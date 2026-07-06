package com.cvalcy.javamysql.model;

public class OrderDetail {

	private int orderNumber;
	private String productCode;
	private int quantityOrdered;
	private double priceEach;
	private short orderLineNumber;

	public OrderDetail() {
	}

	public OrderDetail(int orderNumber, String productCode, int quantityOrdered, double priceEach, short orderLineNumber) {
		this.orderNumber = orderNumber;
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public short getOrderLineNumber() {
		return orderLineNumber;
	}
}
