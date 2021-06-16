package ro.fasttrackit.course4.classes;

import java.util.Scanner;

/**
 * Homework 1.2. Is n prime?
 * 1.2. Calculate if a number is prime. A number is prime if it can be divided to itself or 1 to obtain a whole number result. (2, 3, 5, 7, 11, 13, 17, 23…)
 */

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number and find out if it's prime");
        int prNumber = scanner.nextInt();
        System.out.println("Is prime the number " + prNumber + "? " + isPrime(prNumber));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
