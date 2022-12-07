package org.sdet.string;

public class SwapString {
    public static void main(String[] args) {
        String a = "Test";
        String b = "Case";

        System.out.println(a);
        System.out.println(b);

        a = a.concat(b);

        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("========= After Swap ========");
        System.out.println(a);
        System.out.println(b);

        a = a.concat("-").concat(b);

        b = a.split("-")[0];
        a = a.split("-")[1];

        System.out.println("========= After Second Swap ========");
        System.out.println(a);
        System.out.println(b);
    }
}
