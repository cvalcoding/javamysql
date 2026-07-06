package com.cvalcy.javamysql.service;

import com.cvalcy.javamysql.dao.OrderDetailDao;
import com.cvalcy.javamysql.model.OrderDetail;

import java.util.List;

public class OrderDetailService {

	private final OrderDetailDao orderDetailsDao = new OrderDetailDao();

	public List<OrderDetail> getAllOrderDetail() {return this.orderDetailsDao.fetchAll();}

	public OrderDetail getById(int id) {return this.orderDetailsDao.fetch(id);}
}
