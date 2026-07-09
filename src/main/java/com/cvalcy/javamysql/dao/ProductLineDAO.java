package com.cvalcy.javamysql.dao;

import com.cvalcy.javamysql.model.ProductLine;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductLineDAO extends Dao<ProductLine> {

	@Override
	public List<ProductLine> fetchAll() {
		String query = "SELECT * FROM productlines";
		List<ProductLine> productLines = new ArrayList<>();

		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ProductLine productLine = new ProductLine(
						rs.getString("productLine"),
						rs.getString("textDescription"),
						rs.getString("htmlDescription"),
						rs.getString("image")
				);
				productLines.add(productLine);
			}
		} catch (SQLException e) {
			System.err.println(e.getErrorCode());
			System.err.println(e.getMessage());
			throw new RuntimeException();
		}
		return productLines;
	}

	@Override
	public ProductLine fetch(int id) {
		String query = String.format("SELECT * FROM productlines WHERE productLine = %s", id);
		ProductLine productLine = null;
		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				productLine = new ProductLine(
						rs.getString("productLine"),
						rs.getString("textDescription"),
						rs.getString("htmlDescription"),
						rs.getString("image")
				);
			}
		} catch (SQLException e) {
			System.err.println(e.getErrorCode());
			System.err.println(e.getMessage());
			throw new RuntimeException(e);
		}
		return productLine;
	}
}
