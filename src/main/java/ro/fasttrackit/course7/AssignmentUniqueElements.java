package ro.fasttrackit.course7;

import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;

/**
 * Create a Collection with unique elements.
 * UNSORTED
 */

public class AssignmentUniqueElements {
    public static void main(String[] args) {
        Assignment a1 = new Assignment(UUID.randomUUID(), 8, "Homework 1", "Collection1", Level.MEDIUM);
        Assignment a2 = new Assignment(UUID.randomUUID(), 7, "Homework 1", "Collection2", Level.HARD);
        Assignment a3 = new Assignment(UUID.randomUUID(), 5, "Homework 2", "ProfessorStudent", Level.EASY);
        Assignment a4 = new Assignment(UUID.randomUUID(), 6, "Homework 2", "CountVowelsAndConsonants", Level.EASY);

        HashSet<Assignment> assignments = new HashSet<>();
        assignments.add(a1);
        assignments.add(a2);
        assignments.add(a3);
        assignments.add(a4);
        assignments.add(a1);
        assignments.add(a1);
        assignments.add(a2);
        System.out.println(assignments);
    }
}
