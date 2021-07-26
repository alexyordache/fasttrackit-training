package org.fasttrackit.course3;


import java.util.Arrays;
import java.util.Scanner;

public class SecondClass {
    static boolean isAnagram(String a, String b) {
        boolean temp = false;
        if (a != null && b != null) {
            char[] arrayA = a.toLowerCase().toCharArray();
            char[] arrayB = b.toLowerCase().toCharArray();
            Arrays.sort(arrayA);
            System.out.println(arrayA);
            Arrays.sort(arrayB);
            System.out.println(arrayB);
            temp = Arrays.equals(arrayA, arrayB);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

