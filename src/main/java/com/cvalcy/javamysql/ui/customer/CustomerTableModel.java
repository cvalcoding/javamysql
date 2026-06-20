package com.cvalcy.javamysql.ui.customer;

import com.cvalcy.javamysql.controller.CustomerController;
import com.cvalcy.javamysql.model.Customer;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CustomerTableModel extends AbstractTableModel {

    private final String[] colunmName = {"number", "customerName", "contact_first_name", "contact_last_name", "phone", "address", "address 2", "city", "state", "postal code", "country", "sales employee number"};
    private final List<Customer> customers;

    public CustomerTableModel() {
        CustomerController customerController = new CustomerController();
        this.customers = customerController.index();
    }

    @Override
    public int getRowCount() {
        return this.customers.size();
    }

    @Override
    public int getColumnCount() {
        return colunmName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> this.customers.get(rowIndex).getCustomerNumber();
            case 1 -> this.customers.get(rowIndex).getCustomerName();
            case 2 -> this.customers.get(rowIndex).getContactFirstName();
            case 3 -> this.customers.get(rowIndex).getContactLastName();
            case 4 -> this.customers.get(rowIndex).getPhone();
            case 5 -> this.customers.get(rowIndex).getAddressLine1();
            case 6 -> this.customers.get(rowIndex).getAddressLine2();
            case 7 -> this.customers.get(rowIndex).getCity();
            case 8 -> this.customers.get(rowIndex).getState();
            case 9 -> this.customers.get(rowIndex).getPostalCode();
            case 10 -> this.customers.get(rowIndex).getCountry();
            case 11 -> this.customers.get(rowIndex).getSalesRepEmployeeNumber();
            case 12 -> this.customers.get(rowIndex).getCreditLimit();
            default -> throw new IllegalArgumentException();
        };
    }

    @Override
    public String getColumnName(int column) {
        return colunmName[column];
    }
}
