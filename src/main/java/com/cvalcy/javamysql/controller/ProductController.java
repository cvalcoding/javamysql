package com.cvalcy.javamysql.controller;

import com.cvalcy.javamysql.model.Product;
import com.cvalcy.javamysql.service.ProductService;

import java.util.List;

public class ProductController extends Controller<Product> {

	ProductService productService = new ProductService();

	@Override
	public List<Product> index() {
		return this.productService.getAllProduct();
	}

	@Override
	public Product show(int id) {
		return this.productService.getById(id);
	}
}
