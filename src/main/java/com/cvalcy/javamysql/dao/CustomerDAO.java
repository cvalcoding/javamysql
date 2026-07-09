package com.cvalcy.javamysql.dao;

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
				Customer customer = new Customer(
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
				customers.add(customer);
			}

		} catch (SQLException e) {
			System.err.println(e.getErrorCode());
			System.err.println(e.getMessage());
			throw new RuntimeException(e);
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
				customer = new Customer(
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
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return customer;
	}
}
