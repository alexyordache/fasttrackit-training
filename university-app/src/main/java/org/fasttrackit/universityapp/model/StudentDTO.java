package org.fasttrackit.universityapp.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDTO extends HumanDTO {
    public java.util.List<ScheduledCourseDTO> scheduleCourses = new ArrayList<>();

    public StudentDTO() {
        super();
    }

    public StudentDTO(Long id, String cnp, String lastName, String firstName, List<ScheduledCourseDTO> scheduleCourses) {
        super(id, cnp, lastName, firstName);
        this.scheduleCourses = scheduleCourses;
    }

    public StudentDTO(Long id, String cnp, String lastName, String firstName) {
        super(id, cnp, lastName, firstName);
    }
}
