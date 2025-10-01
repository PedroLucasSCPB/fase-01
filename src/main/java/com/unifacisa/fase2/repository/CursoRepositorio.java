package com.unifacisa.fase2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unifacisa.fase2.entities.Curso;

@Repository
public interface CursoRepositorio extends JpaRepository<Curso, Long> {

}
