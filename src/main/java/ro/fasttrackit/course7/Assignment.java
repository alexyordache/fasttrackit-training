package ro.fasttrackit.course7;

import java.util.UUID;

public class Assignment {
    private UUID id;
    private int courseNumber;
    private String assignmentTitle;
    private String assignmentDescription;
    private Level level;

    public Assignment(UUID id, int courseNumber, String assignmentTitle, String assignmentDescription, Level level) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.assignmentTitle = assignmentTitle;
        this.assignmentDescription = assignmentDescription;
        this.level = level;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "\nAssignment{" +
                "id=" + id +
                ", courseNumber=" + courseNumber +
                ", assignmentTitle='" + assignmentTitle + '\'' +
                ", assignmentDescription='" + assignmentDescription + '\'' +
                ", level=" + level +
                '}';
    }
}
