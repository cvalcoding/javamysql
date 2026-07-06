package com.cvalcy.javamysql.controller;

import com.cvalcy.javamysql.model.OrderDetail;
import com.cvalcy.javamysql.service.OrderDetailService;

import java.util.List;

public class OrderDetailController extends Controller<OrderDetail> {

	OrderDetailService orderDetailService = new OrderDetailService();

	@Override
	public List<OrderDetail> index() {
		return this.orderDetailService.getAllOrderDetail();
	}

	@Override
	public OrderDetail show(int id) {
		return this.orderDetailService.getById(id);
	}
}
