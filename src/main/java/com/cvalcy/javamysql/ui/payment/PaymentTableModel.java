package com.cvalcy.javamysql.ui.payment;

import com.cvalcy.javamysql.controller.PaymentController;
import com.cvalcy.javamysql.model.Payment;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PaymentTableModel extends AbstractTableModel {

	private final String[] columnName = {"#", "number", "date", "amount"};
	private final List<Payment> payments;

	public PaymentTableModel() {
		PaymentController paymentController = new PaymentController();
		this.payments = paymentController.index();
	}

	@Override
	public int getRowCount() {
		return this.payments.size();
	}

	@Override
	public int getColumnCount() {
		return this.columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return switch (columnIndex) {
			case 0 -> this.payments.get(rowIndex).getCustomerNumber();
			case 1 -> this.payments.get(rowIndex).getCheckNumber();
			case 2 -> this.payments.get(rowIndex).getPaymentDate();
			case 3 -> this.payments.get(rowIndex).getAmount();
			default -> throw new IllegalArgumentException();
		};
	}

	@Override
	public String getColumnName(int column) {
		return columnName[column];
	}
}
