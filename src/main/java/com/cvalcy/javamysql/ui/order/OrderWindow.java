package com.cvalcy.javamysql.ui.order;

import javax.swing.*;

public class OrderWindow extends JFrame {

	OrderTableModel tableModel;

	public OrderWindow() {
		this.tableModel = new OrderTableModel();
	}

	public JScrollPane table() {
		JTable table = new JTable(this.tableModel);
		return new JScrollPane(table);
	}
}
