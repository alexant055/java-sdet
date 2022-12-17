package org.sdet.array;

public class MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;

        for (int[] account : accounts) {
            int sum = getSum(account);
            if (sum > wealth) {
                wealth = sum;
            }
        }

        return wealth;
    }

    private static int getSum(int[] account) {
        int j = 0;
        int sum = 0;
        while (j < account.length) {
            sum += account[j];
            j++;
        }
        return sum;
    }
}
