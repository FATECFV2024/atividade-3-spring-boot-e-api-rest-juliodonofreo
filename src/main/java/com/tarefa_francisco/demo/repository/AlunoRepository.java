package com.tarefa_francisco.demo.repository;

import com.tarefa_francisco.demo.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
