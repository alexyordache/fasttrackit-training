package ro.fasttrackit.course8;

import ro.fasttrackit.course7.Assignment;
import ro.fasttrackit.course7.Level;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AssignmentStreams {
    public static void main(String[] args) {

        List<Assignment> asList = new ArrayList<>();
        asList.add(new Assignment(UUID.randomUUID(), 7, "Homework 2", "Collection1", Level.MEDIUM));
        asList.add(new Assignment(UUID.randomUUID(), 7, "Homework 1", "Collection2", Level.HARD));
        asList.add(new Assignment(UUID.randomUUID(), 5, "Homework 4", "ProfessorStudent", Level.EASY));
        asList.add(new Assignment(UUID.randomUUID(), 6, "Homework 2", "CountVowelsAndConsonants", Level.EASY));

        /**
         * 1.1. Using a List<Assignments> as input, use streams and map() to create a List<String> with only their unique IDs.
         *      The expected output is: Set<String> uniqueIds = assignmentsList.stream()..... ;
         */
        //asList.stream().map(assignment -> assignment.getId()).forEach(as -> System.out.println(as));
        Set<String> uniqueIds = asList.stream().map(assignment -> assignment.getId().toString()).collect(Collectors.toSet());
        System.out.println(uniqueIds);

        /**
         * 1.2. Using a List<Assignments> as input, use streams to return a List<Assignments>
         * filtered to have only Difficulty Levels equal to Easy or Medium.
         */
        asList.stream().filter(assignment -> {
            if (assignment.getLevel().equals(Level.EASY) || assignment.getLevel().equals(Level.MEDIUM)) {
                return true;
            }
            return false;
        }).forEach(assignment -> System.out.println(assignment));

        /**
         * 1.3. Add logic to each stream to write on the System console each Assignment as it is passed.
         * Override toString() to write relevant output.
         * Done!
         */

        /**
         * 1.4. Using a List<Assignments> as input, use streams to return a HashMap
         * having unique IDs as Keys and Assignments as values. The expected output type will be HashMap<String, Assignment>.
         * Hint: Use Collectors.toMap(....) and Function.identity().
         */
        Map<UUID, Assignment> assignmentMap = asList.stream().collect(Collectors.toMap(Assignment::getId, Function.identity()));
        System.out.println(assignmentMap);
    }
}
