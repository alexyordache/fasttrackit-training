package ro.fasttrackit.course4.simple;

import java.util.Scanner;

public class Calculate {

    /**
     * Homework 1.1. n factorial
     * 1.1. Calculate and print n! (n factorial). Read n from keyboard. If we read 6 from keyboard => 1*2*3*4*5*6.
     */
    public double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    /**
     * Homework 1.2. Is n prime?
     * 1.2. Calculate if a number is prime. A number is prime if it can be divided to itself or 1 to obtain a whole number result. (2, 3, 5, 7, 11, 13, 17, 23…)
     */
    public boolean isPrime(int n) {
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

    /**
     * Homework 1.3. Is n palindrome?
     * 1.3. Check if a given number from the keyboard is palindrome (a palindrome is a number equal to its reverse 1221, 34143)
     */
    public boolean isPalindrome(int n) {
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

    /**
     * Homework 2. Calculator class
     *
     * 2.1. Create a calculator class with 4 basic operations:
     * Add
     * Subtract
     * Multiply
     * Divide
     *
     * 2.2. The calculator receives 3 parameters:
     * Operator 1
     * Operator 2
     * Operation type
     *
     * 2.3. The input is given from a psvm method.
     * <p>
     * 2.4. Decide how best to implement this
     */
    public double calculate() {
        double a;
        double b;
        char op;
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        a = scanner.nextDouble();
        System.out.println("Please enter the second number: ");
        b = scanner.nextDouble();
        System.out.println("Please enter the operation: ");
        op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return result;
    }
}
