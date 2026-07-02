package com.cvalcy.javamysql.controller;

import com.cvalcy.javamysql.model.Order;
import com.cvalcy.javamysql.service.OrderService;

import java.util.List;

public class OrderController extends Controller<Order> {
	private final OrderService orderService = new OrderService();

	@Override
	public List<Order> index() {
		return this.orderService.getAllOrder();
	}

	@Override
	public Order show(int id) {
		return this.orderService.getById(id);
	}
}
