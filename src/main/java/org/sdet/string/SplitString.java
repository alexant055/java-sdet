package org.sdet.string;

public class SplitString {
    public static void main(String[] args) {
        String stringInput = "This \"is\" a sample \"input for\" your \"next challenge\"";

        String[] splitArray = stringInput.split("\"");

        int count = splitArray.length / 2;

        for (int i = 0; i < splitArray.length; i = i + 2) {
            count += splitArray[i].trim().split(" ").length;
        }

        System.out.println(count);
    }
}
