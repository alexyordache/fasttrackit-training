package org.fasttrackit.springdemo.sample.util;

import org.fasttrackit.springdemo.service.HumanService;
import org.fasttrackit.springdemo.model.Professor;
import org.fasttrackit.springdemo.model.Student;
import org.fasttrackit.springdemo.repository.Repository;

public class StaticServiceLocator {

    private static final Repository<Student> STUDENT_REPOSITORY = new Repository<>();
    private static final Repository<Professor> PROFESSOR_REPOSITORY = new Repository<>();
    private static final HumanService HUMAN_SERVICE = new HumanService(getStudentRepository(), getProfessorRepository());

    public static Repository<Student> getStudentRepository() {
        return STUDENT_REPOSITORY;
    }

    public static Repository<Professor> getProfessorRepository() {
        return PROFESSOR_REPOSITORY;
    }

    public static HumanService getHumanService() {
        return HUMAN_SERVICE;
    }
}