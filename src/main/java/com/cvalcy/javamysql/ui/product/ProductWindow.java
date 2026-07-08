package com.cvalcy.javamysql.ui.product;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProductWindow extends JFrame {

	ProductTableModel tableModel;

	public ProductWindow() {
		this.tableModel = new ProductTableModel();
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
