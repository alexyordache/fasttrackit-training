package org.fasttrackit.universityapp.controller;

import org.fasttrackit.universityapp.model.HumanDTO;
import org.fasttrackit.universityapp.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HumanController {

    private final HumanService humanService;

    @Autowired
    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

    @GetMapping("/humans")
    List<HumanDTO> getAllHumans() {
        return humanService.getAllHumans();
    }

    @GetMapping("/humans/{id}")
    HumanDTO getHumanById(@PathVariable Long id) {
        return humanService.getHumanById(id);
    }

    @PostMapping("/humans")
    HumanDTO createHuman(@RequestBody HumanDTO humanDTO) {
        return humanService.createHuman(humanDTO);
    }

    @DeleteMapping("/humans/{id}")
    String deleteHuman(@PathVariable Long id) {
        humanService.deleteHumanById(id);
        return "Human with id " + id + " was deleted successfully";
    }
}
