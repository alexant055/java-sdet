package org.sdet.string;

public class ReverseWords {
    public static void main(String[] args) {
        String S = "i.like.this.java.program.very.much";

        System.out.println(reverseWords(S));
    }

    static String reverseWords(String S)
    {
//        StringBuilder builder = new StringBuilder();

        String[] sArray = S.trim().split("\\.");

//        for (int i = sArray.length - 1 ; i >= 0; i--) {
//            builder.append(sArray[i]).append(i > 0 ? "." : "");
//        }

        for (int i = 0; i < sArray.length/2; i++) {
            String temp = sArray[i];
            sArray[i] = sArray[sArray.length - i - 1];
            sArray[sArray.length - i - 1] = temp;
        }

        return String.join(".", sArray);
//        return builder.toString();
    }
}
