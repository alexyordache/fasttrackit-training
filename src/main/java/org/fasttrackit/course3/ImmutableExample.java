package org.fasttrackit.course3;

import java.time.LocalDate;

public class ImmutableExample {
    public static void main(String[] args) {
        // Strings are immutable
        String someText = "         Ana are mere          ";
        String modifiedString = someText.replace("a", "b");
        String trimmedString = someText.trim();

        System.out.println("The old String: " + someText);
        System.out.println("Modified String: " + modifiedString);
        System.out.println("Trimmed String: " + trimmedString);

        // Wrapper classes are immutable (Integer, Long, Double, etc.)
        Integer someInt = 10; // Autoboxing (from primitive to wrapper)
        System.out.println(someInt);

        // Date classes
        LocalDate someday = LocalDate.now();
        LocalDate plusTwoDays = someday.plusDays(2);
        System.out.println(someday);
        System.out.println(plusTwoDays);

        String asd = "asd";
        asd.replace("a", "z");
        System.out.println(asd);
    }
}
