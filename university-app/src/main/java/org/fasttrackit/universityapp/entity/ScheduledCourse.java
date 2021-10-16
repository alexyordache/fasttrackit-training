package org.fasttrackit.universityapp.entity;

import javax.persistence.*;

@Entity
public class ScheduledCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Professor professor;
    @ManyToOne
    private Semester semester;

    public ScheduledCourse() {
    }

    public ScheduledCourse(Course course, Professor professor, Semester semester) {
        this.course = course;
        this.professor = professor;
        this.semester = semester;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
