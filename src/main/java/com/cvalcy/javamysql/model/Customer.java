package com.cvalcy.javamysql.model;

public class Customer {

    private Integer customerNumber;
    private String customerName;
    private String contactLastName;
    private String contactFirstName;

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public Customer(int customerNumber, String customerName, String contactLastName, String contactFirstName) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
    }

    public Customer() {
        System.out.println("Hello customer");
    }


}
