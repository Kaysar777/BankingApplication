package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Nacbank Rk");
        bank.addBranch("Astana");
        bank.addCustomerToBranch("Astana", "Kaisar", 1000000.7);
        bank.addCustomerToBranch("Astana", "Bla", 100.9);
        bank.addCustomerToBranch("Astana", "Fral", 13.31);

        bank.addBranch("Sydney");
        bank.addCustomerToBranch("Sydney", "OPop", 1212.12);

        bank.addTransaction("Astana", "Fral", 55.5);
        bank.addTransaction("Astana", "Kaisar", 5.5);
        bank.addTransaction("Astana", "Bla", 1.5);

        bank.listCustomersOfABranch("Astana", true);
        System.out.println();
        bank.listCustomersOfABranch("Sydney", true);

        System.out.println();
        System.out.println();

        if (!bank.addCustomerToBranch("Melbourne", "Brian", 5.53)) {
            System.out.println("Melbourne branch does not exist.");
        }

        System.out.println();

        if (!bank.addBranch("Astana")) {
            System.out.println("Astana branch already exists!    :D");
        }

        System.out.println();

        if (!bank.addTransaction("Astana", "Fergus", 1212.31)) {
            System.out.println("Customer does not exist");
        }

        System.out.println();

        if (!bank.addCustomerToBranch("Astana", "Fral", 12.31)) {
            System.out.println("Customer Fral already exists.");
        }
    }
}
