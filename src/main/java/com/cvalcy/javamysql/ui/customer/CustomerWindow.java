package com.cvalcy.javamysql.ui.customer;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerWindow extends JFrame {

	private final CustomerTableModel tableModel;

	public CustomerWindow() {
		this.tableModel = new CustomerTableModel();
	}

	public JScrollPane table() {
		JTable table = new JTable(this.tableModel);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				int row = table.rowAtPoint(e.getPoint());
				int col = table.columnAtPoint(e.getPoint());
				if (col == 0) {
					System.out.println(table.getValueAt(row, col));
				}
			}
		});
		return new JScrollPane(table);
	}
}
