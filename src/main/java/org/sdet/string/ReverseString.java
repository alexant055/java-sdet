package org.sdet.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "reverseme";
        char[] strArray = str.toCharArray();
        int len = strArray.length;

        for (int i = 0; i < len / 2; i++) {
            char temp = strArray[i];
            strArray[i] = strArray[len - i - 1];
            strArray[len - i - 1] = temp;
        }

        System.out.println(new String(strArray));
    }
}
