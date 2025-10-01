package com.unifacisa.fase2.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Alunos")
@Getter
@Setter

public class Aluno {	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable =false,length = 100 )
	private String nome;
	private String disciplina;
	
	
	@OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
	private Matricula matricula;
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;

	
	public Aluno(String nome, String disciplina) {
		super();
		this.nome = nome;	
		this.disciplina = disciplina;
	}
	
	

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

}
