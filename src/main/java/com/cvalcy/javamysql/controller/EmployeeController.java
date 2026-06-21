package com.cvalcy.javamysql.controller;

import com.cvalcy.javamysql.model.Employee;
import com.cvalcy.javamysql.service.EmployeeService;

import java.util.List;

public class EmployeeController extends Controller<Employee> {

    EmployeeService employeeService = new EmployeeService();

    @Override
    public List<Employee> index() {
        return this.employeeService.getAllEmployee();
    }

    @Override
    public Employee show(int id) {
        return this.employeeService.getById(id);
    }
}
