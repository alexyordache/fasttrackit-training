package org.fasttrackit.springdemo.service;

import org.fasttrackit.springdemo.model.Human;
import org.fasttrackit.springdemo.model.Professor;
import org.fasttrackit.springdemo.model.Student;
import org.fasttrackit.springdemo.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Spring creates an instance of this class and stores it
 * in the Spring ApplicationContext, just because Spring sees
 * the @Service annotation.
 * This instance of SampleService is unique in the Spring
 * Application context and is called a Bean.
 */
@Service
public class HumanService {
    private final Repository<Student> studentRepository;
    private final Repository<Professor> professorRepository;

    public HumanService(Repository<Student> injectedStudentRepository,
                        Repository<Professor> injectedProfessorRepository) {
        this.studentRepository = injectedStudentRepository;
        this.professorRepository = injectedProfessorRepository;
    }

    public List<Human> getAllHumans() {
        List<Human> allHumans = new ArrayList<>();
        allHumans.addAll(this.studentRepository.getAll());
        allHumans.addAll(this.professorRepository.getAll());
        return allHumans;
    }

    public List<Student> getAllStudents() {
        return this.studentRepository.getAll();
    }

    public void addRandomStudent() {
        this.studentRepository.add(new Student());
    }

    public void addStudent(Student studentToAdd) {
        this.studentRepository.add(studentToAdd);
    }

    public void addRandomProfessor() {
        this.professorRepository.add(new Professor());
    }

}