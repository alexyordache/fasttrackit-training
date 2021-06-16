package ro.fasttrackit.course4.simple;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculate f1 = new Calculate();

        System.out.println("Enter the number for which you want to calculate the factorial");
        int facNumber = scanner.nextInt();
        System.out.println("Factorial of " + facNumber + " is: " + f1.factorial(facNumber));

        System.out.println("\nEnter the number and find out if it's prime");
        int prNumber = scanner.nextInt();
        System.out.println("Is prime the number " + prNumber + "? " + f1.isPrime(prNumber));

        System.out.println("\nEnter the number and find out if it's palindrome");
        int pal = scanner.nextInt();
        System.out.println("Is the number " + pal + " palindrome? " + f1.isPalindrome(pal));

        System.out.println("\nThis is a basic calculator with four basic operations");
        System.out.println("The result of your calculation is: " + f1.calculate());
    }
}
