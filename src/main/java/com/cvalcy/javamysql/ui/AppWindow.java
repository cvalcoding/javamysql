package com.cvalcy.javamysql.ui;

import com.cvalcy.javamysql.ui.customer.CustomerWindow;
import com.cvalcy.javamysql.ui.employee.EmployeeWindow;
import com.cvalcy.javamysql.ui.office.OfficeWindow;
import com.cvalcy.javamysql.ui.order.OrderWindow;
import com.cvalcy.javamysql.ui.orderDetail.OrderDetailWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWindow extends JFrame implements ActionListener {

	CardLayout card = new CardLayout();
	JPanel mainPanel = new JPanel();

	public AppWindow() {
		EmployeeWindow employeeWindow = new EmployeeWindow();
		CustomerWindow customerWindow = new CustomerWindow();
		OfficeWindow officeWindow = new OfficeWindow();
		OrderWindow orderWindow = new OrderWindow();
		OrderDetailWindow orderDetailWindow = new OrderDetailWindow();

		this.mainPanel.setLayout(this.card);

		JButton employeeButton = new JButton("employee");
		employeeButton.addActionListener(this);

		JButton customerButton = new JButton("customer");
		customerButton.addActionListener(this);

		JButton officeButton = new JButton("office");
		officeButton.addActionListener(this);

		JButton orderButton = new JButton("order");
		orderButton.addActionListener(this);

		JButton orderDetailButton = new JButton("order detail");
		orderDetailButton.addActionListener(this);

		this.mainPanel.add(employeeWindow.table(), "employee");
		this.mainPanel.add(customerWindow.table(), "customer");
		this.mainPanel.add(officeWindow.table(), "office");
		this.mainPanel.add(orderWindow.table(), "order");
		this.mainPanel.add(orderDetailWindow.table(), "orderDetail");

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(employeeButton);
		buttonPanel.add(customerButton);
		buttonPanel.add(officeButton);
		buttonPanel.add(orderButton);
		buttonPanel.add(orderDetailButton);

		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		this.add(buttonPanel, BorderLayout.NORTH);
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
			case "order" -> this.card.show(this.mainPanel, "order");
			case "order detail" -> this.card.show(this.mainPanel, "orderDetail");
			default -> this.card.show(this.mainPanel, "employee");
		}
	}
}
