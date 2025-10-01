package com.unifacisa.fase2.services;
import java.util.List;

import org.springframework.stereotype.Service;
import com.unifacisa.fase2.entities.Professor;
import com.unifacisa.fase2.repository.ProfessorRepositorio;

@Service
public class ProfessorService {
	private final ProfessorRepositorio professorRepositorio;
	
	public ProfessorService(ProfessorRepositorio professorRepositorio) {
        this.professorRepositorio = professorRepositorio;
    }
	public List<Professor> listarProfessores() {
        return professorRepositorio.findAll();
    }
	public Professor inserirProfessor(Professor professor) {
        return professorRepositorio.save(professor);
    }

	
}
