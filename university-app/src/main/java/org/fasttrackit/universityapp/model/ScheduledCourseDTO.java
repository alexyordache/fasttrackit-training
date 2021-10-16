package org.fasttrackit.universityapp.model;

public class ScheduledCourseDTO {
    public String professorName;
    public String courseContent;
    public String department;

    public ScheduledCourseDTO(String professorName, String courseContent, String department) {
        this.professorName = professorName;
        this.courseContent = courseContent;
        this.department = department;
    }
}
