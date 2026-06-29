package com.cvalcy.javamysql.ui;

import com.cvalcy.javamysql.ui.customer.CustomerWindow;
import com.cvalcy.javamysql.ui.employee.EmployeeWindow;

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

        JButton btn1 = new JButton("TOTO");
        btn1.addActionListener(this);

        JButton btn2 = new JButton("Majin");
        btn2.addActionListener(this);

        this.mainPanel.add(employeeWindow.table());
        this.mainPanel.add(customerWindow.table());

        JButton btn3 = new JButton("C");
        JButton btn4 = new JButton("D");
        JButton btn5 = new JButton("E");
        JPanel panel1 = new JPanel();
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);
        panel1.add(btn5);

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
        this.card.next(this.mainPanel);
    }
}
