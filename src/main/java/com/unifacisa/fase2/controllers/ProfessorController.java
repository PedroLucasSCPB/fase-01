package com.unifacisa.fase2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.unifacisa.fase2.entities.Professor;
import com.unifacisa.fase2.services.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    
    @GetMapping
    public List<Professor> listarProfessores() {
        return professorService.listarProfessores();
    }

    
    @PostMapping
    public Professor inserirProfessor(@RequestBody Professor professor) {
        return professorService.inserirProfessor(professor);
    }

    
}
