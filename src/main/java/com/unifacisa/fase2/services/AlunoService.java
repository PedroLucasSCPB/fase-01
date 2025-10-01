package com.unifacisa.fase2.services;
import java.util.List;
import com.unifacisa.fase2.entities.Aluno;
import com.unifacisa.fase2.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepositorio alunoRepositorio;
	
	public Aluno cadastrarAluno(Aluno aluno) {
		
		return alunoRepositorio.save(aluno);
		
	}
	public List<Aluno> listarAluno() {
		
		return alunoRepositorio.findAll();
		
	}
	
	public AlunoService() {
		// TODO Auto-generated constructor stub
	}

}
