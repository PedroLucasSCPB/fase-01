package com.unifacisa.fase2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unifacisa.fase2.entities.Aluno;
import com.unifacisa.fase2.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoservice;
	
	@PostMapping
	public Aluno cadastrarAluno(@RequestBody Aluno cadastrar_aluno) {
		return alunoservice.cadastrarAluno(cadastrar_aluno);
	}

	@GetMapping
	public List<Aluno> listarAluno(){
		return alunoservice.listarAluno();
		
	}
	

}
