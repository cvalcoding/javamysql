package com.cvalcy.javamysql.controller;

import com.cvalcy.javamysql.model.Customer;

import java.util.List;

abstract class Controller<T> {

    abstract public List<Customer> index();

    abstract public T show(int id);

}
