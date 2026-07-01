package com.cvalcy.javamysql.service;

import com.cvalcy.javamysql.dao.EmployeeDAO;
import com.cvalcy.javamysql.model.Employee;

import java.util.List;

public class EmployeeService {

    private final EmployeeDAO employeeDAO = new EmployeeDAO();

    public List<Employee> getAllEmployee() {
        return this.employeeDAO.fetchAll();
    }

    public Employee getById(int id) {
        return this.employeeDAO.fetch(id);
    }
}
