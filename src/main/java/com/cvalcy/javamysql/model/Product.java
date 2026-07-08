package com.cvalcy.javamysql.model;

public class Product {
	private String productCode;
	private String productName;
	private String productLine;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private short quantityInStock;
	private double buyPrice;
	private double msrp;

	public Product() {
	}

	public Product(String productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, short quantityInStock, double buyPrice, double msrp) {
		this.productCode = productCode;
		this.productName = productName;
		this.productLine = productLine;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public String getProductLine() {
		return this.productLine;
	}

	public String getProductScale() {
		return this.productScale;
	}

	public String getProductVendor() {
		return this.productVendor;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public short getQuantityInStock() {
		return this.quantityInStock;
	}

	public double getBuyPrice() {
		return this.buyPrice;
	}

	public double getMsrp() {
		return this.msrp;
	}
}
