package com.company;

import java.util.ArrayList;

/**
 * Created by Kaisar on 12/17/16.
 */
public class Branch {
    private String name;
    ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public boolean addCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            if (this.customers.add(new Customer(customerName, initialTransaction))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean addTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);

        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(name)) {
                return this.customers.get(i);
            }
        }
        return null;
    }
}
