package org.fasttrackit.universityapp.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "humans")
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cnp;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "firstname")
    private String firstName;

    public Human() {
    }

    public Human(String cnp, String lastName, String firstName) {
        this.cnp = cnp;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Human(Long id, String cnp, String lastName, String firstName) {
        this.id = id;
        this.cnp = cnp;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id.equals(human.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
