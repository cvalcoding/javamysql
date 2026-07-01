package com.cvalcy.javamysql.service;

import com.cvalcy.javamysql.dao.CustomerDAO;
import com.cvalcy.javamysql.model.Customer;

import java.util.List;

public class CustomerService {
    private final CustomerDAO customerDAO = new CustomerDAO();

    public List<Customer> getAllCustomer() {
        return this.customerDAO.fetchAll();
    }

    public Customer getById(int id) {
        return this.customerDAO.fetch(id);
    }
}
