package com.cvalcy.javamysql.service;

import com.cvalcy.javamysql.dao.ProductDAO;
import com.cvalcy.javamysql.model.Product;

import java.util.List;

public class ProductService {
	private final ProductDAO productDAO = new ProductDAO();

	public List<Product> getAllProduct() {return this.productDAO.fetchAll();}

	public Product getById(int id) {return this.productDAO.fetch(id);}
}
