package com.cvalcy.javamysql.ui.customer;

import javax.swing.*;

public class CustomerWindow extends JFrame {

    private final CustomerTableModel tableModel;

    public CustomerWindow() {

        this.tableModel = new CustomerTableModel();


    }

    public JScrollPane table() {
        JTable table = new JTable(this.tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        return scrollPane;
    }
}
