package com.cvalcy.javamysql.dao;

import com.cvalcy.javamysql.model.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends Dao<Employee> {
    @Override
    public List<Employee> fetchAll() {
        String query = "SELECT * FROM employees";
        List<Employee> employees = new ArrayList<>();
        try {
            PreparedStatement stmt = this.db.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("employeeNumber"),
                        rs.getString("lastName"),
                        rs.getString("firstName"),
                        rs.getString("extension"),
                        rs.getString("email"),
                        rs.getString("officeCode"),
                        rs.getInt("reportsTo"),
                        rs.getString("jobTitle")
                );
                employees.add(employee);
            }
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return employees;
    }

    @Override
    public Employee fetch(int id) {
        String query = "SELECT * FROM employees WHERE employeeNumber = " + id;
        Employee employee = null;

        try {
            PreparedStatement stmt = this.db.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                employee = new Employee(
                        rs.getInt("employeeNumber"),
                        rs.getString("lastName"),
                        rs.getString("firstName"),
                        rs.getString("extension"),
                        rs.getString("email"),
                        rs.getString("officeCode"),
                        rs.getInt("reportsTo"),
                        rs.getString("jobTitle")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return employee;
    }
}
