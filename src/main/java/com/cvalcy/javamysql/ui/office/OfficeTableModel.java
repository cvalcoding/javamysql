package com.cvalcy.javamysql.ui.office;

import com.cvalcy.javamysql.controller.OfficeController;
import com.cvalcy.javamysql.model.Office;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class OfficeTableModel extends AbstractTableModel {

    private final String[] columnName = { "#", "city", "phone", "address", "address 2", "state", "country", "postal code", "territory" };
    private final List<Office> offices;

    public OfficeTableModel() {
        OfficeController officeController = new OfficeController();
        this.offices = officeController.index();
    }

    @Override
    public int getRowCount() {
        return this.offices.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> this.offices.get(rowIndex).getOfficeCode();
            case 1 -> this.offices.get(rowIndex).getCity();
            case 2 -> this.offices.get(rowIndex).getPhone();
            case 3 -> this.offices.get(rowIndex).getAddressLine1();
            case 4 -> this.offices.get(rowIndex).getAddressLine2();
            case 5 -> this.offices.get(rowIndex).getState();
            case 6 -> this.offices.get(rowIndex).getCountry();
            case 7 -> this.offices.get(rowIndex).getPostalCode();
            case 8 -> this.offices.get(rowIndex).getTerritory();
            default -> throw new IllegalArgumentException();
        };
    }

    @Override
    public String getColumnName(int column) {
        return this.columnName[column];
    }
}
