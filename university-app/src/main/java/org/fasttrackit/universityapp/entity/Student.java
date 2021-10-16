package org.fasttrackit.universityapp.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne
    private Human human;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "studentCourses",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "scheduled_course_id")}
    )
    List<ScheduledCourse> scheduledCourses = new ArrayList<>();

    public Student() {
    }

    public Student(Human human) {
        this.human = human;
    }

    public Student(String cnp, String firstName, String lastName) {
        this.human = new Human(cnp, firstName, lastName);
    }

    public String getCnp() {
        return this.human.getCnp();
    }

    public String getFirstName() {
        return this.human.getFirstName();
    }

    public String getLastName() {
        return this.human.getLastName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ScheduledCourse> getScheduledCourses() {
        return scheduledCourses;
    }

    public void setScheduledCourses(List<ScheduledCourse> scheduledCourses) {
        this.scheduledCourses = scheduledCourses;
    }
}
