package ro.fasttrackit.course4.classes;

import java.util.Scanner;

/**
 * Homework 1.1. n factorial
 * 1.1. Calculate and print n! (n factorial). Read n from keyboard. If we read 6 from keyboard => 1*2*3*4*5*6.
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for which you want to calculate the factorial");
        int facNumber = scanner.nextInt();
        System.out.println("Factorial of " + facNumber + " is: " + factorial(facNumber));

        System.out.println("factorial");
        System.out.println(fact(facNumber));

    }

    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static double fact(int n) {
        double fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }
}
