package ro.fasttrackit.course4.classes;

import java.util.Scanner;

/**
 * Homework 1.3. Is n palindrome?
 * 1.3. Check if a given number from the keyboard is palindrome (a palindrome is a number equal to its reverse 1221, 34143)
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number and find out if it's palindrome");
        int pal = scanner.nextInt();
        System.out.println("Is the number " + pal + " palindrome? " + isPalindrome(pal));
    }

    public static boolean isPalindrome(int n) {
        int r;
        int sum = 0;
        int temp;

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }
}
