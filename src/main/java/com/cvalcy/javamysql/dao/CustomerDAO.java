package com.cvalcy.javamysql.dao;

import com.cvalcy.javamysql.core.Log;
import com.cvalcy.javamysql.model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends Dao<Customer> {

	@Override
	public List<Customer> fetchAll() {
		String query = "SELECT * FROM customers";
		List<Customer> customers = new ArrayList<>();

		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				customers.add(createCustomer(rs));
			}

		} catch (SQLException e) {
			Log.error(e.getMessage(), e.getErrorCode());
			throw new RuntimeException(e.getMessage());
		}
		return customers;
	}

	@Override
	public Customer fetch(int id) {
		String query = String.format("Select * from customers where customerNumber = %s", id);
		Customer customer = null;

		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				customer = createCustomer(rs);
			}
		} catch (SQLException e) {
			Log.error(e.getMessage(), e.getErrorCode());
			throw new RuntimeException(e);
		}

		return customer;
	}

	private Customer createCustomer(ResultSet rs) throws SQLException {
		return new Customer(
				rs.getInt("customerNumber"),
				rs.getString("customerName"),
				rs.getString("contactLastName"),
				rs.getString("contactFirstName"),
				rs.getString("phone"),
				rs.getString("addressLine1"),
				rs.getString("addressLine2"),
				rs.getString("city"),
				rs.getString("state"),
				rs.getString("postalCode"),
				rs.getString("country"),
				rs.getString("salesRepEmployeeNumber"),
				rs.getString("creditLimit")
		);

	}
}
