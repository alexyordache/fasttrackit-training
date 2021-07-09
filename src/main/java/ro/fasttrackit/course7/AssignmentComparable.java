package ro.fasttrackit.course7;

import java.util.UUID;

public class AssignmentComparable extends Assignment implements Comparable<AssignmentComparable> {
    public AssignmentComparable(UUID id, int courseNumber, String assignmentTitle, String assignmentDescription, Level level) {
        super(id, courseNumber, assignmentTitle, assignmentDescription, level);
    }

    // Create a sorted Collection which orders by a custom Comparator by the course number and difficulty level.
    @Override
    public int compareTo(AssignmentComparable o) {
        final int x = Integer.compare(this.getCourseNumber(), o.getCourseNumber());
        final int y = Integer.compare(this.getLevel().getLevel(), o.getLevel().getLevel());
        if (x == 0) {
            return y;
        }
        return x;
    }
}
