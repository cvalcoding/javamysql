package com.cvalcy.javamysql.ui.office;

import javax.swing.*;

public class OfficeWindow extends JFrame {

    OfficeTableModel tableModel;

    public OfficeWindow() {
        this.tableModel = new OfficeTableModel();
    }

    public JScrollPane table() {
        JTable table = new JTable(this.tableModel);
        return new JScrollPane(table);
    }
}
