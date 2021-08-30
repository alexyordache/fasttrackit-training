package org.fasttrackit.springdemo.sample;

import org.fasttrackit.springdemo.service.HumanService;
import org.fasttrackit.springdemo.model.Professor;
import org.fasttrackit.springdemo.model.Student;
import org.fasttrackit.springdemo.repository.Repository;

public class InjectionDemoRunner {

    public static void main(String[] args) {
        Repository<Student> studentRepositoryToInject = new Repository<>();
        Repository<Professor> professorRepositoryToInject = new Repository<>();

        HumanService humanService = new HumanService(
                studentRepositoryToInject,
                professorRepositoryToInject);

        humanService.getAllHumans();
        humanService.addRandomProfessor();
        humanService.addRandomStudent();
    }
}