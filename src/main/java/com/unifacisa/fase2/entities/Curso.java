package com.unifacisa.fase2.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Cursos")
@Getter
@Setter
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCurso;
	
	@Column(nullable = false,length = 100)
	private String nomeCurso;
	
	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
	private List<Aluno> alunos = new ArrayList<>();
	
	@ManyToMany(mappedBy = "cursos")
	private List<Professor> professores = new ArrayList<>();
	
	public Curso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Curso() {
	}
}
