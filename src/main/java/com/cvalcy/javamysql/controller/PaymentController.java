package com.cvalcy.javamysql.controller;

import com.cvalcy.javamysql.model.Payment;
import com.cvalcy.javamysql.service.PaymentService;

import java.util.List;

public class PaymentController extends Controller<Payment> {

	PaymentService paymentService = new PaymentService();

	@Override
	public List<Payment> index() {
		return this.paymentService.getAllPayment();
	}

	@Override
	public Payment show(int id) {
		return this.paymentService.getById(id);
	}
}
