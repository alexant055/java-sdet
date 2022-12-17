package org.sdet.numbers;

public class SecondLargestNumber {
    public static void main(String[] args) {
        System.out.println(secondLargestNumber(4, 5, 3, 2, 1, 0));
    }

    static int secondLargestNumber(int... number) {
        int large = -1;
        if (number.length > 0)
            large = number[0];

        int secondLarge = -1;

        for (int n : number)
            if (n > large)
                secondLarge = large;

        return secondLarge;
    }
}
