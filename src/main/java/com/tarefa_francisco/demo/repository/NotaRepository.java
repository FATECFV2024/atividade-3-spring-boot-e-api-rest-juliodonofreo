package com.tarefa_francisco.demo.repository;

import com.tarefa_francisco.demo.entities.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
