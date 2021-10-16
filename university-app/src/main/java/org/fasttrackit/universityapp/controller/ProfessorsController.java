package org.fasttrackit.universityapp.controller;

import org.fasttrackit.universityapp.entity.Human;
import org.fasttrackit.universityapp.entity.Professor;
import org.fasttrackit.universityapp.model.ProfessorDTO;
import org.fasttrackit.universityapp.repository.HumansRepository;
import org.fasttrackit.universityapp.repository.ProfessorsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProfessorsController {

    private final ProfessorsRepository professorsRepository;
    private final HumansRepository humanRepository;

    public ProfessorsController(ProfessorsRepository professorsRepository, HumansRepository humanRepository) {
        this.professorsRepository = professorsRepository;
        this.humanRepository = humanRepository;
    }

    @GetMapping("/professors")
    List<ProfessorDTO> getAllProfessors() {
        return professorsRepository.findAll().stream().map(professor -> new ProfessorDTO(
                professor.getId(),
                professor.getCnp(),
                professor.getFirstName(),
                professor.getLastName())).collect(Collectors.toList());
    }

    @GetMapping("/professors/{id}")
    ProfessorDTO getProfessorById(@PathVariable Long id) {
        Professor professor = professorsRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        return new ProfessorDTO(
                professor.getId(),
                professor.getCnp(),
                professor.getFirstName(),
                professor.getLastName());
    }

    @PostMapping("/professors")
    ProfessorDTO createProfessor(@RequestBody ProfessorDTO professorDTO) {
        Human human = humanRepository.save(new Human(professorDTO.cnp, professorDTO.firstName, professorDTO.lastName));
        Professor professor = new Professor(human);
        Professor savedProfessor = professorsRepository.save(professor);
        return new ProfessorDTO(
                savedProfessor.getId(),
                savedProfessor.getCnp(),
                savedProfessor.getFirstName(),
                savedProfessor.getLastName());
    }


    @DeleteMapping("/professors/{id}")
    String deleteProfessorById(@PathVariable Long id) {
        professorsRepository.deleteById(id);
        return "Professor with id " + id + " was deleted successfully";
    }
}
