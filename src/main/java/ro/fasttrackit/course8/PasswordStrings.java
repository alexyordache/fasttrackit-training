package ro.fasttrackit.course8;

import java.util.Scanner;

public class PasswordStrings {
    /**
     * Write a Java method to check whether a string is a valid password, character by character. You can use toCharArray()
     * Password rules:
     * has at least 12 characters.
     * has uppercase and lowercase characters.
     * has only letters and digits. Hint: use char number value.
     * contains at least 3 digits.
     * Expected Output:
     * A password is entered to the method and:
     * If it is valid: the password is printed and the text “is valid”
     * If it is invalid: the password is print and all rules which are not fulfilled
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password to be checked:");
        String password = scanner.nextLine();

        if (passwordValidation(password)) {
            System.out.println("The password is valid");
        } else {
            System.out.println("The password is not valid: " + password);
        }
    }

    public static boolean passwordValidation(String password) {
        char ch;
        boolean hasPasswordLength = false;
        boolean hasCapitalCase = false;
        boolean hasLowerCase = false;
        boolean hasLettersAndDigits = false;
        int digitCounter = 0;
        String numRegex = ".*[0-9].*";
        String alphaRegex = ".*[A-Z].*";


        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (password.length() >= 12) {
                hasPasswordLength = true;
            }
            if (Character.isUpperCase(ch)) {
                hasCapitalCase = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            if (password.matches(numRegex) && password.matches(alphaRegex)) {
                hasLettersAndDigits = true;
            }
            if (Character.isDigit(ch)) {
                digitCounter++;
            }
            if (hasPasswordLength && hasLettersAndDigits && hasCapitalCase && hasLowerCase && digitCounter >= 3) {
                return true;
            }

        }
        if (hasPasswordLength == false) {
            System.out.println("Password length should contain at least 12 characters");
        }
        if (hasCapitalCase == false) {
            System.out.println("Password should contain at least one uppercase character");
        }
        if (hasLowerCase == false) {
            System.out.println("Password should contain at least one lowercase character");
        }
        if (hasLettersAndDigits == false) {
            System.out.println("Password should contain only letters and digits");
        }
        if (digitCounter < 3) {
            System.out.println("Password should contain at least 3 digits");
        }
        return false;
    }
}
