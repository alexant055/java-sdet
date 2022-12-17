package org.sdet.numbers;

import java.util.Arrays;

public class ReplaceZero {

    public static void main(String[] args) {
        int[] numbers = {1, 0, 0, 0, 1, 1, 1, 0};
        int replaceIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[replaceIndex] > numbers[i]) {
                int temp = numbers[replaceIndex];
                numbers[replaceIndex] = numbers[i];
                numbers[i] = temp;
                replaceIndex = i;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
