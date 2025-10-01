package com.unifacisa.fase2.controllers;

import com.unifacisa.fase2.entities.Curso;
import com.unifacisa.fase2.services.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    
    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }
}
