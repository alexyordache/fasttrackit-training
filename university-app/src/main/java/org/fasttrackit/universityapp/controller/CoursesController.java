package org.fasttrackit.universityapp.controller;

import org.fasttrackit.universityapp.entity.Course;
import org.fasttrackit.universityapp.model.CourseDTO;
import org.fasttrackit.universityapp.repository.CoursesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CoursesController {

    private final CoursesRepository coursesRepository;

    public CoursesController(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @GetMapping("/courses")
    List<CourseDTO> getAllCourses() {
        return coursesRepository.findAll().stream().map(course -> new CourseDTO(
                course.getId(),
                course.getContent())).collect(Collectors.toList());
    }

    @GetMapping("/courses/{id}")
    CourseDTO getCoursesById(@PathVariable Long id) {
        Course course = coursesRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        return new CourseDTO(
                course.getId(),
                course.getContent());
    }

    @PostMapping("/courses")
    CourseDTO createCourse(@RequestBody CourseDTO courseDTO) {
        Course course = coursesRepository.save(new Course(courseDTO.content));
        return new CourseDTO(
                course.getId(),
                course.getContent());
    }

    @DeleteMapping("/courses/{id}")
    String deleteCourseById(@PathVariable Long id) {
        coursesRepository.deleteById(id);
        return "Course with id " + id + " was deleted successfully";
    }
}