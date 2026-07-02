package com.cvalcy.javamysql.dao;

import com.cvalcy.javamysql.model.Office;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfficeDAO extends Dao<Office> {

    @Override
    public List<Office> fetchAll() {
        String query = "SELECT * FROM offices";
        List<Office> offices = new ArrayList<>();

        try {
            PreparedStatement stmt = this.db.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Office office = new Office(
                        rs.getInt("officeCode"),
                        rs.getString("city"),
                        rs.getString("phone"),
                        rs.getString("addressLine1"),
                        rs.getString("addressLine2"),
                        rs.getString("state"),
                        rs.getString("country"),
                        rs.getString("postalCode"),
                        rs.getString("territory")
                );
                offices.add(office);
            }
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return offices;
    }

    @Override
    public Office fetch(int id) {
        String query = "Select * from offices where officeCode = " + id;
        Office office = null;

        try {
            PreparedStatement stmt = this.db.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                office = new Office(
                        rs.getInt("officeCode"),
                        rs.getString("city"),
                        rs.getString("phone"),
                        rs.getString("addressLine1"),
                        rs.getString("addressLine2"),
                        rs.getString("state"),
                        rs.getString("country"),
                        rs.getString("postalCode"),
                        rs.getString("territory")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return office;
    }
}
