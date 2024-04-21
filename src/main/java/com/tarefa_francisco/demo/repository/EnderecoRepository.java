package com.tarefa_francisco.demo.repository;

import com.tarefa_francisco.demo.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
