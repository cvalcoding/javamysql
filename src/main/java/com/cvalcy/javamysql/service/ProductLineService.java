package com.cvalcy.javamysql.service;

import com.cvalcy.javamysql.dao.ProductLineDAO;
import com.cvalcy.javamysql.model.ProductLine;

import java.util.List;

public class ProductLineService {
	private final ProductLineDAO productLineDAO = new ProductLineDAO();

	public List<ProductLine> getAllProductLine() {return this.productLineDAO.fetchAll();}

	public ProductLine getById(int id) {return this.productLineDAO.fetch(id);}
}
