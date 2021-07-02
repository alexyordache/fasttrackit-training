package ro.fasttrackit.course6;

import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int vowelsCount = 0;
        int consonantsCount = 0;
        String str = scanner.nextLine();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            switch (ch) {
                case 'a':
                case 'i':
                case 'e':
                case 'o':
                case 'u':
                    vowelsCount++;
                    break;
                default:
                    if (ch >= 'a' && ch <= 'z') {
                        consonantsCount++;
                    }
            }
// This ia another way to solve the problem, using if - else if statement
/*
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelsCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                consonantsCount++;
            }
*/
        }

        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
