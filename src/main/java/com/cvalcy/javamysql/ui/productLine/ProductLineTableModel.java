package com.cvalcy.javamysql.ui.productLine;

import com.cvalcy.javamysql.controller.ProductLineController;
import com.cvalcy.javamysql.model.ProductLine;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ProductLineTableModel extends AbstractTableModel {
	private final String[] columnName = {"line", "text description", "html description", "image"};
	private final List<ProductLine> productLines;

	public ProductLineTableModel() {
		ProductLineController productLineController = new ProductLineController();
		this.productLines = productLineController.index();
	}

	@Override
	public int getRowCount() {
		return this.productLines.size();
	}

	@Override
	public int getColumnCount() {
		return this.columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return switch (columnIndex) {
			case 0 -> this.productLines.get(rowIndex).getProductLine();
			case 1 -> this.productLines.get(rowIndex).getTextDescription();
			case 2 -> this.productLines.get(rowIndex).getHtmlDescription();
			case 3 -> this.productLines.get(rowIndex).getImage();
			default -> throw new IllegalArgumentException();
		};
	}

	@Override
	public String getColumnName(int column) {
		return this.columnName[column];
	}
}
