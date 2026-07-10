package com.cvalcy.javamysql.dao;

import com.cvalcy.javamysql.model.Payment;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentDAO extends Dao<Payment> {

	@Override
	public List<Payment> fetchAll() {
		String query = "SELECT * FROM payments";
		List<Payment> payments = new ArrayList<>();
		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Payment payment = new Payment(
						rs.getInt("customerNumber"),
						rs.getString("checkNumber"),
						rs.getDate("paymentDate"),
						rs.getDouble("amount")
				);

				payments.add(payment);
			}
		} catch (SQLException e) {
			System.err.println(e.getErrorCode());
			System.err.println(e.getMessage());
			throw new RuntimeException(e);
		}
		return payments;
	}

	@Override
	public Payment fetch(int id) {
		String query = String.format("SELECT * FROM payments WHERE customerNumber = %s", id);
		Payment payment = null;
		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				payment = new Payment(
						rs.getInt("customerNumber"),
						rs.getString("checkNumber"),
						rs.getDate("paymentDate"),
						rs.getDouble("amount")
				);
			}
		} catch (SQLException e) {
			System.err.println(e.getErrorCode());
			System.err.println(e.getMessage());
			throw new RuntimeException(e);
		}
		return payment;
	}
}
