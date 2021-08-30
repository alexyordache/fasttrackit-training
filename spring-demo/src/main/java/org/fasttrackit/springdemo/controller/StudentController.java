package org.fasttrackit.springdemo.controller;


import org.fasttrackit.springdemo.model.Student;
import org.fasttrackit.springdemo.service.HumanService;
import org.fasttrackit.springdemo.service.SampleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
public class StudentController {

    private final SampleService sampleService;
    private final HumanService humanService;

    /**
     * @Value uses SpEL (Spring Expression Language)
     * to read values from .property files.
     * The default file in Spring for this is
     * application.properties
     */
    @Value("${mygivenvalue}")
    private String textFromPropertyFile;

    /**
     * Constructor injection using Spring DI.
     *
     * @param injectedService taken from Spring Application Context
     */
    public StudentController(SampleService injectedService,
                             HumanService injectedHumanService) {
        this.sampleService = injectedService;
        this.humanService = injectedHumanService;
    }

    @GetMapping("/example")
    public String getExampleStudent() {
        return this.sampleService.getSampleMessage();
    }

    @GetMapping("/value")
    public String getValueFromPropertyFile() {
        return this.textFromPropertyFile;
    }

    @PostMapping("/student")
    public void addStudent() {
        Student newlyCreatedStudent = new Student("Ion", "Pop",
                LocalDate.of(1999, Month.MARCH, 1));
        this.humanService.addStudent(newlyCreatedStudent);
    }

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return this.humanService.getAllStudents();
    }
}