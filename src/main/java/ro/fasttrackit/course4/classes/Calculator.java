package ro.fasttrackit.course4.classes;

import java.util.Scanner;

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
 *
 * 2.4. Decide how best to implement this
 */

public class Calculator {
    public static void main(String[] args) {
        System.out.println("This is a basic calculator with four basic operations");
        calculate();
    }

    public static void calculate() {
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
        System.out.println(a + " " + op + " " + b + " = " + result);
    }
}
