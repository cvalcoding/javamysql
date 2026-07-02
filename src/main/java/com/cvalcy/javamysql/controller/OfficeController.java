package com.cvalcy.javamysql.controller;

import com.cvalcy.javamysql.model.Office;
import com.cvalcy.javamysql.service.OfficeService;

import java.util.List;

public class OfficeController extends Controller<Office> {

    OfficeService officeService = new OfficeService();

    @Override
    public List<Office> index() {
        return this.officeService.getAllOffice();
    }

    @Override
    public Office show(int id) {
        return this.officeService.getById(id);
    }
}
