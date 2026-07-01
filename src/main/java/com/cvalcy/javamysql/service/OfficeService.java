package com.cvalcy.javamysql.service;

import com.cvalcy.javamysql.dao.OfficeDAO;
import com.cvalcy.javamysql.model.Office;

import java.util.List;

public class OfficeService {
    private final OfficeDAO officeDAO = new OfficeDAO();

    public List<Office> getAllOffice() {
        return this.officeDAO.fetchAll();
    }

    public Office getById(int id) {
        return this.officeDAO.fetch(id);
    }
}
