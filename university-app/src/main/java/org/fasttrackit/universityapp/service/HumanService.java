package org.fasttrackit.universityapp.service;

import javassist.NotFoundException;
import org.fasttrackit.universityapp.entity.Human;
import org.fasttrackit.universityapp.model.HumanDTO;
import org.fasttrackit.universityapp.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HumanService {

    private final HumanRepository humanRepository;

    @Autowired
    public HumanService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public List<HumanDTO> getAllHumans() {
        List<Human> humans = humanRepository.findAll();
        return humans.stream()
                .map(h -> new HumanDTO(h.getId(),
                        h.getCnp(),
                        h.getFirstName(),
                        h.getLastName()))
                .collect(Collectors.toList());
    }

    public HumanDTO getHumanById(Long id) {
        return humanRepository.findById(id).map(h -> new HumanDTO(h.getId(),
                h.getCnp(),
                h.getFirstName(),
                h.getLastName())).orElseThrow(() -> new RuntimeException("Human not found"));
    }

    public HumanDTO createHuman(HumanDTO humanDTO) {
        Human h = humanRepository.saveAndFlush(new Human(humanDTO.id, humanDTO.cnp, humanDTO.firstName, humanDTO.lastName));
        return new HumanDTO(h.getId(),
                h.getCnp(),
                h.getFirstName(),
                h.getLastName());
    }

    public void deleteHumanById(Long id) {
        humanRepository.deleteById(id);
    }

}
