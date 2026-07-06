package com.cvalcy.javamysql.dao;

import com.cvalcy.javamysql.model.OrderDetail;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailDao extends Dao<OrderDetail> {

	@Override
	public List<OrderDetail> fetchAll() {
		String query = "SELECT * FROM orderdetails";
		List<OrderDetail> orderDetails = new ArrayList<>();
		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				OrderDetail orderDetail = new OrderDetail(
						rs.getInt("orderNumber"),
						rs.getString("productCode"),
						rs.getInt("quantityOrdered"),
						rs.getDouble("priceEach"),
						rs.getShort("orderLineNumber")
				);
				orderDetails.add(orderDetail);
			}
		} catch (SQLException e) {
			System.err.println(e.getErrorCode());
			System.err.println(e.getMessage());
			throw new RuntimeException(e);
		}
		return orderDetails;
	}

	@Override
	public OrderDetail fetch(int id) {
		String query = "SELECT * FROM orderdetails WHERE orderNumber = " + id;
		OrderDetail orderDetail = null;
		try {
			PreparedStatement stmt = this.db.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				orderDetail = new OrderDetail(
						rs.getInt("orderNumber"),
						rs.getString("productCode"),
						rs.getInt("quantityOrdered"),
						rs.getDouble("priceEach"),
						rs.getShort("orderLineNumber")
				);
			}
		} catch (SQLException e) {
			System.err.println(e.getErrorCode());
			System.err.println(e.getMessage());
			throw new RuntimeException(e);
		}
		return orderDetail;
	}
}
