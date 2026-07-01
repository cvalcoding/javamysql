package com.cvalcy.javamysql.ui.employee;

import javax.swing.*;

public class EmployeeWindow extends JFrame {

    EmployeeTableModel tableModel;

    public EmployeeWindow() {

        this.tableModel = new EmployeeTableModel();
    }

    public JScrollPane table() {
        JTable table = new JTable(this.tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        return scrollPane;
    }
}
