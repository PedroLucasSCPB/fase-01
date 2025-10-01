package com.unifacisa.fase2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unifacisa.fase2.entities.Matricula;

@Repository
public interface MatriculaRepositorio extends JpaRepository<Matricula, Long> {

}
