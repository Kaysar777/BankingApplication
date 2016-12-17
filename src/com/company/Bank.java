package com.company;

import java.util.ArrayList;

/**
 * Created by Kaisar on 12/17/16.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomerToBranch(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, initialTransaction);
        }

        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomersOfABranch(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Customer details for branch " + branchName);
            if (showTransactions) {
                for (int i = 0; i < branch.getCustomers().size(); i++) {
                    System.out.println(branch.getCustomers().get(i).getName());
                    //transactions
                    for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++) {
                        System.out.println("\ttransaction" + j + " -> " + branch.getCustomers().get(i).getTransactions().get(j));
                    }
                }
            } else {
                for (int i = 0; i < branch.getCustomers().size(); i++) {
                    System.out.println(branch.getCustomers().get(i).getName());
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(name)) {
                return this.branches.get(i);
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
