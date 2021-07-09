package ro.fasttrackit.course7;

import java.util.Comparator;

public class AssignmentComparator implements Comparator<Assignment> {

    // Create a sorted Collection which orders by a custom Comparator by the course number and assignment title.
    @Override
    public int compare(Assignment o1, Assignment o2) {
        int x = o1.getAssignmentTitle().compareTo(o2.getAssignmentTitle());
        int y = o1.getCourseNumber() - o2.getCourseNumber();
        if (x == 0) {
            return y;
        }
        return x;
    }
}
