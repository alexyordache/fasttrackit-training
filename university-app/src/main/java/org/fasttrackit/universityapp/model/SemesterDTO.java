package org.fasttrackit.universityapp.model;

import java.time.LocalDate;

public class SemesterDTO {
    public Long id;
    public String universityDept;
    public String universityYear;
    public String semesterNo;
    public LocalDate startDate;
    public LocalDate endDate;

    public SemesterDTO(Long id, String universityDept, String universityYear, String semesterNo, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.universityDept = universityDept;
        this.universityYear = universityYear;
        this.semesterNo = semesterNo;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
