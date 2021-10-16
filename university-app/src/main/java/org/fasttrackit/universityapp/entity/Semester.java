package org.fasttrackit.universityapp.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String universityDept;
    private String universityYear;
    private String semesterNo;
    @Basic
    private LocalDate startDate;
    @Basic
    private LocalDate endDate;

    public Semester() {
    }

    public Semester(Long id, String universityDept, String universityYear, String semesterNo, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.universityDept = universityDept;
        this.universityYear = universityYear;
        this.semesterNo = semesterNo;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniversityDept() {
        return universityDept;
    }

    public void setUniversityDept(String universityDept) {
        this.universityDept = universityDept;
    }

    public String getUniversityYear() {
        return universityYear;
    }

    public void setUniversityYear(String universityYear) {
        this.universityYear = universityYear;
    }

    public String getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(String semesterNo) {
        this.semesterNo = semesterNo;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
