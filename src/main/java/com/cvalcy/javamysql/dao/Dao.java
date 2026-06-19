package com.cvalcy.javamysql.dao;

import com.cvalcy.javamysql.core.Database;

import java.sql.Connection;
import java.util.List;

public abstract class Dao<T> {
    protected Connection db = Database.connectDb();

    public abstract List<T> fetchAll();

    public abstract T fetch(int id);
}
