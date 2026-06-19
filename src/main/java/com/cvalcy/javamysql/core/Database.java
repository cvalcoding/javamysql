package com.cvalcy.javamysql.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    static final String DB_URL = "jdbc:mysql://localhost/javamysql";
    static final String USER = "javauser";
    static final String PASS = "javauser";

    public static Connection connectDb() {
        try {
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            System.err.println(e.getErrorCode());
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
