package ro.fasttrackit.course18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i > 0 && numbersMap.get(ch) > numbersMap.get(s.charAt(i - 1))) {
                result += numbersMap.get(ch) - 2 * numbersMap.get(s.charAt(i - 1));
            } else
                result += numbersMap.get(ch);
        }
        return result;
    }


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String romanNumber = scanner.next();
        int result = romanToInt(romanNumber);

        System.out.println("The Roman Number is: " + romanNumber);
        System.out.println("Its Integer Value is: " + result);
    }
}