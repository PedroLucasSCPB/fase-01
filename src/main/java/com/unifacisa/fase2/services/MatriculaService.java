package com.unifacisa.fase2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.unifacisa.fase2.entities.Matricula;
import com.unifacisa.fase2.repository.MatriculaRepositorio;

@Service
public class MatriculaService {
	
	@Autowired
	private MatriculaRepositorio matricularepositorio;
	
	public Matricula cadastrarMatricula(Matricula matriculaCadastrar) {
		return matricularepositorio.save(matriculaCadastrar);
		
	}
	
	public List<Matricula> listarMatricula(){
		return matricularepositorio.findAll();
	}

}
