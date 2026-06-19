package com.cvalcy.javamysql;

import com.cvalcy.javamysql.controller.CustomerController;
import com.cvalcy.javamysql.model.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomerController cc = new CustomerController();
        for (Customer data : cc.index()) {
            System.out.println(data.getContactFirstName());
        }

        System.out.println(cc.show(103).getCustomerName());

    }
}