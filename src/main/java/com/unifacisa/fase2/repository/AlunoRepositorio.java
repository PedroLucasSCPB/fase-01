package com.unifacisa.fase2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unifacisa.fase2.entities.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno,Long> {

}
