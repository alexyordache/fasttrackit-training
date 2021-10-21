package org.fasttrackit.universityapp.model;

public class CourseDTO {
    public Long id;
    public String content;

    public CourseDTO(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
