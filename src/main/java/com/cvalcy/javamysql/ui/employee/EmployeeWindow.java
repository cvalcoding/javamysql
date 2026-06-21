package com.cvalcy.javamysql.ui.employee;

import javax.swing.*;

public class EmployeeWindow extends JFrame {

    public EmployeeWindow() {
        super("Employee");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);

        EmployeeTableModel tableModel = new EmployeeTableModel();

        JTable table = new JTable(tableModel);
        this.getContentPane().add(new JScrollPane(table));

        this.setVisible(true);
    }
}
