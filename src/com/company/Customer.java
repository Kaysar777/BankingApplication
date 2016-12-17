package com.company;

import java.util.ArrayList;

/**
 * Created by Kaisar on 12/17/16.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions.add(transactions);
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
