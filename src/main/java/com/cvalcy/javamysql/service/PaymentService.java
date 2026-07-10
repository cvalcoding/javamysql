package com.cvalcy.javamysql.service;

import com.cvalcy.javamysql.dao.PaymentDAO;
import com.cvalcy.javamysql.model.Payment;

import java.util.List;

public class PaymentService {
	private final PaymentDAO paymentDAO = new PaymentDAO();

	public List<Payment> getAllPayment() {
		return this.paymentDAO.fetchAll();
	}

	public Payment getById(int id) {return this.paymentDAO.fetch(id);}
}
