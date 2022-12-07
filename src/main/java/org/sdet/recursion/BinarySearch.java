package org.sdet.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(isElementFound(inputArray, 7));
        System.out.println(isElementFound(inputArray, 4));
    }

    static int isElementFound(int[] items, int searchNumber) {
        return binarySearch(items, 0, items.length, searchNumber);
    }

    private static int binarySearch(int[] items, int start, int end, int findingNumber) {
        if (start > end)
            return -1;
        else {
            int mid = (start + end) / 2;

            if (items[mid] == findingNumber)
                return mid;
            else if (findingNumber > items[mid])
                return binarySearch(items, mid + 1, end, findingNumber);
            else
                return binarySearch(items, start, mid - 1, findingNumber);
        }
    }
}
