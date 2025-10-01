package com.unifacisa.fase2.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.fase2.entities.Aluno;
import com.unifacisa.fase2.entities.Matricula;
import com.unifacisa.fase2.services.MatriculaService;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
	
	@Autowired
	private MatriculaService matriculaservice;
	
	@PostMapping
	public Matricula matriculaCadastrar	(@RequestBody Matricula matriculaCadastrar) {
		return matriculaservice.cadastrarMatricula(matriculaCadastrar);
	}
	
	
	@GetMapping
	public List<Matricula> matriculalistar(){
		return matriculaservice.listarMatricula();
		
		
	}
}
