package org.sdet.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arrayInput = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberToFind = 5;

        System.out.println(binarySearch(arrayInput, numberToFind));
    }

    private static int binarySearch(int[] arrayInput, int numberToFind) {
        int startIndex = 0;
        int endIndex = arrayInput.length;

        if (numberToFind > arrayInput[endIndex - 1] || numberToFind < arrayInput[startIndex])
            return -1;

        while (endIndex > startIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (arrayInput[mid] == numberToFind) return mid;
            else if (arrayInput[mid] < numberToFind) startIndex = mid;
            else endIndex = mid;
        }

        return -1;
    }
}
