package ro.fasttrackit.course7;

import java.util.*;

public class AssignmentOrdered {

    public static void main(String[] args) {

        /**
         * Create a sorted Collection which orders by a custom Comparator by the course number and difficulty level.
         */
        AssignmentComparable a1 = new AssignmentComparable(UUID.randomUUID(), 7, "Homework 1", "Collection1", Level.MEDIUM);
        AssignmentComparable a2 = new AssignmentComparable(UUID.randomUUID(), 7, "Homework 1", "Collection2", Level.HARD);
        AssignmentComparable a3 = new AssignmentComparable(UUID.randomUUID(), 5, "Homework 2", "ProfessorStudent", Level.EASY);
        AssignmentComparable a4 = new AssignmentComparable(UUID.randomUUID(), 6, "Homework 2", "CountVowelsAndConsonants", Level.EASY);

        List<AssignmentComparable> assignments1 = new ArrayList<>();
        assignments1.add(a1);
        assignments1.add(a2);
        assignments1.add(a3);
        assignments1.add(a4);
        assignments1.add(a1);
        System.out.println("Before sorting" + assignments1);
        Collections.sort(assignments1);
        System.out.println("After sorting" + assignments1);

        TreeSet<AssignmentComparable> assignmentComparableTreeSet = new TreeSet<>();
        assignmentComparableTreeSet.add(a1);
        assignmentComparableTreeSet.add(a2);
        assignmentComparableTreeSet.add(a3);
        assignmentComparableTreeSet.add(a4);
        System.out.println("Already sorted tree of assignments");
        System.out.println(assignmentComparableTreeSet);

        /**
         * Create a sorted Collection which orders by a custom Comparator by the course number and assignment title.
         */
        Assignment assignment1 = new Assignment(UUID.randomUUID(), 7, "Homework 2", "Collection1", Level.MEDIUM);
        Assignment assignment2 = new Assignment(UUID.randomUUID(), 7, "Homework 1", "Collection2", Level.HARD);
        Assignment assignment3 = new Assignment(UUID.randomUUID(), 5, "Homework 4", "ProfessorStudent", Level.EASY);
        Assignment assignment4 = new Assignment(UUID.randomUUID(), 6, "Homework 2", "CountVowelsAndConsonants", Level.EASY);

        TreeSet<Assignment> assignmentTreeSet = new TreeSet<>(new AssignmentComparator());
        assignmentTreeSet.add(assignment1);
        assignmentTreeSet.add(assignment2);
        assignmentTreeSet.add(assignment3);
        assignmentTreeSet.add(assignment4);
        System.out.println(assignmentTreeSet);

        /**
         * Put the collection inside a Map to easily lookup
         * by a concatenated String composed of the Course Number + Difficulty Level.
         */
        HashMap<Integer, Level> hashMapCol = new HashMap<>();
        hashMapCol.put(assignment1.getCourseNumber(), assignment1.getLevel());
        hashMapCol.put(assignment2.getCourseNumber(), assignment2.getLevel());
        hashMapCol.put(assignment3.getCourseNumber(), assignment3.getLevel());
        hashMapCol.put(assignment4.getCourseNumber(), assignment4.getLevel());
        System.out.println(hashMapCol.get(5));
        System.out.println(hashMapCol.get(7));
        System.out.println(hashMapCol.get(6));
    }
}
