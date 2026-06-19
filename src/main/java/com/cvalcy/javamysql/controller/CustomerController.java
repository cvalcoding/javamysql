package com.cvalcy.javamysql.controller;

import com.cvalcy.javamysql.model.Customer;
import com.cvalcy.javamysql.service.CustomerService;

import java.util.List;

public class CustomerController extends Controller<Customer> {

    CustomerService customerService = new CustomerService();

    @Override
    public List<Customer> index() {
        return this.customerService.getAllCustomer();
    }

    @Override
    public Customer show(int id) {
        return this.customerService.getById(id);
    }
}
