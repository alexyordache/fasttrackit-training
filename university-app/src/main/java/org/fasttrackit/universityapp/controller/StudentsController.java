package org.fasttrackit.universityapp.controller;

import org.fasttrackit.universityapp.entity.*;
import org.fasttrackit.universityapp.model.AssignCoursesRequest;
import org.fasttrackit.universityapp.model.ScheduledCourseDTO;
import org.fasttrackit.universityapp.model.StudentDTO;
import org.fasttrackit.universityapp.repository.*;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StudentsController {

    private final StudentsRepository studentsRepository;
    private final HumansRepository humanRepository;
    private final CoursesRepository coursesRepository;
    private final ProfessorsRepository professorRepository;
    private final SemestersRepository semestersRepository;
    private final ScheduleCourseRepository scheduleCourseRepository;

    public StudentsController(StudentsRepository studentsRepository, HumansRepository humanRepository, CoursesRepository coursesRepository, ProfessorsRepository professorRepository, SemestersRepository semestersRepository, ScheduleCourseRepository scheduleCourseRepository) {
        this.studentsRepository = studentsRepository;
        this.humanRepository = humanRepository;
        this.coursesRepository = coursesRepository;
        this.professorRepository = professorRepository;
        this.semestersRepository = semestersRepository;
        this.scheduleCourseRepository = scheduleCourseRepository;
    }

    @GetMapping("/students")
    List<StudentDTO> getAllStudents() {
        return studentsRepository.findAll().stream().map(student -> new StudentDTO(
                student.getId(),
                student.getCnp(),
                student.getFirstName(),
                student.getLastName(),
                student.getScheduledCourses().stream().map(s -> new ScheduledCourseDTO(
                        s.getProfessor().getFirstName(),
                        s.getCourse().getContent(),
                        s.getSemester().getUniversityDept())).collect(Collectors.toList())
        )).collect(Collectors.toList());
    }

    @GetMapping("/students/{id}")
    Student getStudentById(@PathVariable Long id) {
        return studentsRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @PostMapping("/students")
    @Transactional
    Student createStudent(@RequestBody StudentDTO studentDTO) {
        Human human = humanRepository.save(new Human(studentDTO.cnp, studentDTO.firstName, studentDTO.lastName));
        Student student = new Student(human);
        return studentsRepository.save(student);
    }

    @DeleteMapping("/students/{id}")
    String deleteStudentById(@PathVariable Long id) {
        studentsRepository.deleteById(id);
        return "Student with id " + id + " was deleted successfully";
    }

    @Transactional
    @PutMapping("/students/courses")
    List<StudentDTO> assignCourses(@RequestBody AssignCoursesRequest assignCoursesRequest) {
        Course course = coursesRepository.findById(assignCoursesRequest.courseId).orElseThrow(() -> new RuntimeException("Course not found"));
        Professor professor = professorRepository.findById(assignCoursesRequest.professorId).orElseThrow(() -> new RuntimeException("Course not found"));
        List<Semester> semesters = semestersRepository.findByUniversityDeptAndUniversityYearAndSemesterNo(assignCoursesRequest.department, assignCoursesRequest.year, assignCoursesRequest.semesterNo);
        Semester semester = semesters.stream().findFirst().orElseThrow(() -> new RuntimeException("Semester not found"));
        ScheduledCourse scheduledCourse = new ScheduledCourse(course, professor, semester);

        ScheduledCourse save = scheduleCourseRepository.save(scheduledCourse);

        List<Student> students = assignCoursesRequest.studentIds.stream().map(id -> studentsRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"))).collect(Collectors.toList());
        List<Student> updatedStudents = new ArrayList<>();
        for (Student student : students) {
            student.getScheduledCourses().add(save);
            updatedStudents.add(studentsRepository.save(student));
        }

        // TODO Sent rabbitMQ notification to the other project
/*        rabbitTemplate.convertAndSend(MessagingRabbitmqApplication.topicExchangeName, "foo.bar.baz", "Hello from RabbitMQ!");
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);*/

        return updatedStudents.stream().map(student -> new StudentDTO(
                student.getId(),
                student.getCnp(),
                student.getFirstName(),
                student.getLastName(),
                student.getScheduledCourses().stream().map(s -> new ScheduledCourseDTO(
                        s.getProfessor().getFirstName(),
                        s.getCourse().getContent(),
                        s.getSemester().getUniversityDept())).collect(Collectors.toList())
        )).collect(Collectors.toList());
    }
}
