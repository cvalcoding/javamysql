package com.cvalcy.javamysql.ui.product;

import com.cvalcy.javamysql.controller.ProductController;
import com.cvalcy.javamysql.model.Product;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ProductTableModel extends AbstractTableModel {

	private final String[] columnName = {"#", "name", "line", "scale", "vendor", "description", "quantity", "buy price", "MSRP"};
	private final List<Product> products;

	public ProductTableModel() {
		ProductController productController = new ProductController();
		this.products = productController.index();
	}

	@Override
	public int getRowCount() {
		return this.products.size();
	}

	@Override
	public int getColumnCount() {
		return this.columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return switch (columnIndex) {
			case 0 -> this.products.get(rowIndex).getProductCode();
			case 1 -> this.products.get(rowIndex).getProductName();
			case 2 -> this.products.get(rowIndex).getProductLine();
			case 3 -> this.products.get(rowIndex).getProductScale();
			case 4 -> this.products.get(rowIndex).getProductVendor();
			case 5 -> this.products.get(rowIndex).getProductDescription();
			case 6 -> this.products.get(rowIndex).getQuantityInStock();
			case 7 -> this.products.get(rowIndex).getBuyPrice();
			case 8 -> this.products.get(rowIndex).getMsrp();
			default -> throw new IllegalArgumentException();
		};
	}
}
