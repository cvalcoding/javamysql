package com.cvalcy.javamysql.controller;

import java.util.List;

abstract class Controller<T> {

    abstract public List<T> index();

    abstract public T show(int id);

}
