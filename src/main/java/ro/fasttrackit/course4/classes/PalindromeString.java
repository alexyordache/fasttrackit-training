package ro.fasttrackit.course4.classes;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String reverseStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.equals(reverseStr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
