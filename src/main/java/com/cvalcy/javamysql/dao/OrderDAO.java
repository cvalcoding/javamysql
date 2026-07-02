package com.cvalcy.javamysql.dao;

import com.cvalcy.javamysql.model.Order;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO extends Dao<Order> {

    @Override
    public List<Order> fetchAll() {
        String query = "SELECT * FROM orders";
        List<Order> orders = new ArrayList<>();

        try {
            PreparedStatement stmt = this.db.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Order order = new Order(
                        rs.getInt("orderNumber"),
                        rs.getDate("orderDate"),
                        rs.getDate("requiredDate"),
                        rs.getDate("shippedDate"),
                        rs.getString("status"),
                        rs.getString("comments"),
                        rs.getInt("customerNumber")
                );
                orders.add(order);
            }
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return orders;
    }

    @Override
    public Order fetch(int id) {
        String query = "SELECT * FROM orders WHERE orderNumber = " + id;
        Order order = null;
        try {
            PreparedStatement stmt = this.db.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                order = new Order(
                        rs.getInt("orderNumber"),
                        rs.getDate("orderDate"),
                        rs.getDate("requiredDate"),
                        rs.getDate("shippedDate"),
                        rs.getString("status"),
                        rs.getString("comments"),
                        rs.getInt("customerNumber")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return order;
    }
}
