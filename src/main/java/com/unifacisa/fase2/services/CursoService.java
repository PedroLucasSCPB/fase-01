package com.unifacisa.fase2.services;

import com.unifacisa.fase2.entities.Curso;
import com.unifacisa.fase2.repository.CursoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepositorio cursoRepository;

    public CursoService(CursoRepositorio cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }
}

