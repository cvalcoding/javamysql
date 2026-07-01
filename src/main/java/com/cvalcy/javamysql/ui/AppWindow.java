package com.cvalcy.javamysql.ui;

import com.cvalcy.javamysql.ui.customer.CustomerWindow;
import com.cvalcy.javamysql.ui.employee.EmployeeWindow;
import com.cvalcy.javamysql.ui.office.OfficeWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWindow extends JFrame implements ActionListener {

    JScrollPane scrollPane = null;
    CardLayout card = new CardLayout();
    JPanel mainPanel = new JPanel();

    public AppWindow() {
        JPanel content = new JPanel();
        this.mainPanel.setLayout(this.card);
        EmployeeWindow employeeWindow = new EmployeeWindow();
        CustomerWindow customerWindow = new CustomerWindow();
        OfficeWindow officeWindow = new OfficeWindow();

        JButton employeeButton = new JButton("employee");
        employeeButton.addActionListener(this);

        JButton customerButton = new JButton("customer");
        customerButton.addActionListener(this);

        JButton officeButton = new JButton("office");
        officeButton.addActionListener(this);

        this.mainPanel.add(employeeWindow.table(), "employee");
        this.mainPanel.add(customerWindow.table(), "customer");
        this.mainPanel.add(officeWindow.myCustomLabel(), "office");

        JPanel panel1 = new JPanel();
        panel1.add(employeeButton);
        panel1.add(customerButton);
        panel1.add(officeButton);

        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));

        this.add(panel1, BorderLayout.NORTH);
        this.add(this.mainPanel, BorderLayout.CENTER);

        this.setSize(1200, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getActionCommand();
        System.out.println(obj);

        switch (obj.toString()) {
            case "employee" -> this.card.show(this.mainPanel, "employee");
            case "customer" -> this.card.show(this.mainPanel, "customer");
            case "office" -> this.card.show(this.mainPanel, "office");
            default -> this.card.show(this.mainPanel, "employee");
        }
    }
}
