package org.fasttrackit.universityapp.model;

public class HumanDTO {
    public Long id;
    public String cnp;
    public String lastName;
    public String firstName;

    public HumanDTO() {
    }

    public HumanDTO(Long id, String cnp, String lastName, String firstName) {
        this.id = id;
        this.cnp = cnp;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}