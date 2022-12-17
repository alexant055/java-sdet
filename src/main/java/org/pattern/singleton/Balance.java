package org.pattern.singleton;

public class Balance {
    // create one instance that will be shared among other classes
    private static final Balance instance = new Balance();
    private double balanceAvailable;

    // private to prevent creating objects outside of this class
    private Balance() {
        // the actual balance might come from data base but here we just giving random balance
        this.balanceAvailable = 25000.00;
    }

    public static Balance getInstance() {
        return instance;
    }

    // some useful method that doesn't relate to balance
    public static double calculate() {
        return 7.7;
    }

    public void spend(double amount) {
        balanceAvailable -= amount;
    }

    public double getBalanceAvailable() {
        return balanceAvailable;
    }
}

