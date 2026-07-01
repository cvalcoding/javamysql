package com.cvalcy.javamysql.ui.employee;

import com.cvalcy.javamysql.controller.EmployeeController;
import com.cvalcy.javamysql.model.Employee;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EmployeeTableModel extends AbstractTableModel {

    private final String[] columnName = {"id", "last_name", "first_name", "extension", "email", "job_title"};
    private final List<Employee> employees;

    public EmployeeTableModel() {
        EmployeeController employeeController = new EmployeeController();
        this.employees = employeeController.index();
    }

    @Override
    public int getRowCount() {
        return this.employees.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> this.employees.get(rowIndex).getEmployeeNumber();
            case 1 -> this.employees.get(rowIndex).getLastName();
            case 2 -> this.employees.get(rowIndex).getFirstName();
            case 3 -> this.employees.get(rowIndex).getExtension();
            case 4 -> this.employees.get(rowIndex).getEmail();
            case 5 -> this.employees.get(rowIndex).getJobTitle();
            default -> throw new IllegalArgumentException();
        };
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }
}
