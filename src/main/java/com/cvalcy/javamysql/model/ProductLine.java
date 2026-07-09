package com.cvalcy.javamysql.model;

public class ProductLine {
	private String productLine;
	private String textDescription;
	private String htmlDescription;
	private String image;

	public ProductLine() {
	}

	public ProductLine(String productLine, String textDescription, String htmlDescription, String image) {
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}

	public String getProductLine() {
		return this.productLine;
	}

	public String getTextDescription() {
		return this.textDescription;
	}

	public String getHtmlDescription() {
		return this.htmlDescription;
	}

	public String getImage() {
		return this.image;
	}
}
