package com.cvalcy.javamysql.dao;

import com.cvalcy.javamysql.model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends Dao<Product> {

	@Override
	public List<Product> fetchAll() {
		String query = "SELECT * FROM products";
		List<Product> products = new ArrayList<>();

		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Product product = new Product(
						rs.getString("productCode"),
						rs.getString("productName"),
						rs.getString("productLine"),
						rs.getString("productScale"),
						rs.getString("productVendor"),
						rs.getString("productDescription"),
						rs.getShort("quantityInStock"),
						rs.getDouble("buyPrice"),
						rs.getDouble("msrp")
				);
				products.add(product);
			}
		} catch (SQLException e) {
			System.err.println(e.getErrorCode());
			System.err.println(e.getMessage());
			throw new RuntimeException(e);
		}
		return products;
	}

	@Override
	public Product fetch(int id) {
		String query = String.format("SELECT * FROM products WHERE productCode = %s", id);
		Product product = null;
		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				product = new Product(
						rs.getString("productCode"),
						rs.getString("productName"),
						rs.getString("productLine"),
						rs.getString("productScale"),
						rs.getString("productVendor"),
						rs.getString("productDescription"),
						rs.getShort("quantityInStock"),
						rs.getDouble("buyPrice"),
						rs.getDouble("msrp")
				);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return product;
	}
}
