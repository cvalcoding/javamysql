package com.cvalcy.javamysql.controller;

import com.cvalcy.javamysql.model.ProductLine;
import com.cvalcy.javamysql.service.ProductLineService;

import java.util.List;

public class ProductLineController extends Controller<ProductLine> {

	ProductLineService productLineService = new ProductLineService();

	@Override
	public List<ProductLine> index() {
		return this.productLineService.getAllProductLine();
	}

	@Override
	public ProductLine show(int id) {
		return this.productLineService.getById(id);
	}
}
