package org.pattern.singleton;

public class Main {
    public static void main(String[] args) {
        // Balance obj = new Balance(); doesn't compile - constructor is private
        Balance husband = Balance.getInstance();
        System.out.println("Available balance: " + husband.getBalanceAvailable());
        husband.spend(250.00); // husband goes for shopping
        System.out.println("Available balance: " + husband.getBalanceAvailable());

        System.out.println("---------");

        Balance wife = Balance.getInstance();
        System.out.println("Available balance: " + wife.getBalanceAvailable());
        wife.spend(5000.00); // wife goes for shopping
        System.out.println("Available balance: " + wife.getBalanceAvailable());

        System.out.println("---------");

        System.out.println("Available balance: " + husband.getBalanceAvailable());
    }
}
