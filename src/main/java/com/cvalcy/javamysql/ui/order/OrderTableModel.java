package com.cvalcy.javamysql.ui.order;

import com.cvalcy.javamysql.controller.OrderController;
import com.cvalcy.javamysql.model.Order;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class OrderTableModel extends AbstractTableModel {

	private final String[] columnName = {"#", "order date", "required date", "shipped", "status", "comment"};
	private final List<Order> orders;

	public OrderTableModel() {
		OrderController orderController = new OrderController();
		this.orders = orderController.index();
	}

	@Override
	public int getRowCount() {
		return this.orders.size();
	}

	@Override
	public int getColumnCount() {
		return this.columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return switch (columnIndex) {
			case 0 -> this.orders.get(rowIndex).getCustomerNumber();
			case 1 -> this.orders.get(rowIndex).getOrderDate();
			case 2 -> this.orders.get(rowIndex).getRequiredDate();
			case 3 -> this.orders.get(rowIndex).getShippedDate();
			case 4 -> this.orders.get(rowIndex).getStatus();
			case 5 -> this.orders.get(rowIndex).getComments();
			default -> throw new IllegalArgumentException();
		};
	}

	@Override
	public String getColumnName(int column) {
		return this.columnName[column];
	}
}
