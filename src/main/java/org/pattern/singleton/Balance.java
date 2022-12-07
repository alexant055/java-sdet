package org.pattern.singleton;

public class Balance {
    private double balanceAvailable;
    // create one instance that will be shared among other classes
    private static final Balance instance = new Balance();

    // private to prevent creating objects outside of this class
    private Balance() {
        // the actual balance might come from data base but here we just giving random balance
        this.balanceAvailable = 25000.00;
    }

    public static Balance getInstance() {
        return instance;
    }

    public void spend(double amount) {
        balanceAvailable -= amount;
    }

    public double getBalanceAvailable() {
        return balanceAvailable;
    }

    // some useful method that doesn't relate to balance
    public static double calculate() {
        return 7.7;
    }
}

