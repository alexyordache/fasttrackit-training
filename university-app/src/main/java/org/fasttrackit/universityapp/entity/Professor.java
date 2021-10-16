package org.fasttrackit.universityapp.entity;

import javax.persistence.*;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne
    private Human human;

    public Professor(String cnp, String firstName, String lastName) {
        this.human = new Human(cnp, firstName, lastName);
    }

    public Professor() {
    }

    public Professor(Human human) {
        this.human = human;
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

}
