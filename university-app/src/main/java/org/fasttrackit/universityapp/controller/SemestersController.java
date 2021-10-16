package org.fasttrackit.universityapp.controller;

import org.fasttrackit.universityapp.entity.Semester;
import org.fasttrackit.universityapp.model.SemesterDTO;
import org.fasttrackit.universityapp.repository.SemestersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SemestersController {

    private final SemestersRepository semesterRepository;

    public SemestersController(SemestersRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }

    @GetMapping("/semesters")
    List<SemesterDTO> getAllSemesters() {
        return semesterRepository.findAll().stream().map(semester -> new SemesterDTO(
                        semester.getId(),
                        semester.getUniversityDept(),
                        semester.getUniversityYear(),
                        semester.getSemesterNo(),
                        semester.getStartDate(),
                        semester.getEndDate()))
                .collect(Collectors.toList());
    }

    @GetMapping("/semesters/{id}")
    SemesterDTO getSemesterById(@PathVariable Long id) {
        Semester semester = semesterRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        return new SemesterDTO(
                semester.getId(),
                semester.getUniversityDept(),
                semester.getUniversityYear(),
                semester.getSemesterNo(),
                semester.getStartDate(),
                semester.getEndDate());
    }

    @PostMapping("/semesters")
    SemesterDTO createSemester(@RequestBody SemesterDTO semesterDTO) {
        Semester semester = semesterRepository.save(new Semester(null, semesterDTO.universityDept, semesterDTO.universityYear, semesterDTO.semesterNo, semesterDTO.startDate, semesterDTO.endDate));
        return new SemesterDTO(
                semester.getId(),
                semester.getUniversityDept(),
                semester.getUniversityYear(),
                semester.getSemesterNo(),
                semester.getStartDate(),
                semester.getEndDate());
    }

    @DeleteMapping("/semesters/{id}")
    String deleteSemesterById(@PathVariable Long id) {
        semesterRepository.deleteById(id);
        return "Semester with id " + id + " was deleted successfully";
    }
}
