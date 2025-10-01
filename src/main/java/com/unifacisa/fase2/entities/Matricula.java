package com.unifacisa.fase2.entities;

import java.time.LocalDateTime;

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

@Getter
@Setter
@Entity
@Table(name = "matricula")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime datahora;
	private String descricao;
	
	@OneToOne
	@JoinColumn(name="aluno_id")
	Aluno aluno;

	public Matricula(LocalDateTime datahora, String descricao, Aluno aluno) {
		super();
		this.datahora = datahora;
		this.descricao = descricao;
		this.aluno = aluno;
	}
	
	

}
