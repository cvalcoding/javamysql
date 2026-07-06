package com.cvalcy.javamysql.ui.orderDetail;

import com.cvalcy.javamysql.controller.OrderDetailController;
import com.cvalcy.javamysql.model.OrderDetail;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class OrderDetailTableModel extends AbstractTableModel {

	private final String[] columnName = {"#", "code", "quantity", "price", "line number"};
	private final List<OrderDetail> orderDetails;

	public OrderDetailTableModel() {
		OrderDetailController orderDetailController = new OrderDetailController();
		this.orderDetails = orderDetailController.index();
	}

	@Override
	public int getRowCount() {
		return this.orderDetails.size();
	}

	@Override
	public int getColumnCount() {
		return this.columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return switch (columnIndex) {
			case 0 -> this.orderDetails.get(rowIndex).getOrderNumber();
			case 1 -> this.orderDetails.get(rowIndex).getProductCode();
			case 2 -> this.orderDetails.get(rowIndex).getQuantityOrdered();
			case 3 -> this.orderDetails.get(rowIndex).getPriceEach();
			case 4 -> this.orderDetails.get(rowIndex).getOrderLineNumber();
			default -> throw new IllegalArgumentException();
		};
	}

	@Override
	public String getColumnName(int column) {
		return this.columnName[column];
	}
}
