package com.cvalcy.javamysql.service;

import com.cvalcy.javamysql.dao.OrderDAO;
import com.cvalcy.javamysql.model.Order;

import java.util.List;

public class OrderService {
    private final OrderDAO orderDAO = new OrderDAO();

    public List<Order> getAllOrder() {
        return this.orderDAO.fetchAll();
    }

    public Order getById(int id) {
        return this.orderDAO.fetch(id);
    }
}
