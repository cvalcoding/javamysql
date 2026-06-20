package com.cvalcy.javamysql.ui.customer;

import javax.swing.*;

public class Window extends JFrame {

    public Window() {
        super("Customers");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);

        CustomerTableModel tableModel = new CustomerTableModel();

        JTable table = new JTable(tableModel);
        this.getContentPane().add(new JScrollPane(table));
//        this.add(this.getContentPane().add(table));

        this.setVisible(true);
    }
}
