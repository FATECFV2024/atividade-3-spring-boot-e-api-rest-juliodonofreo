package com.tarefa_francisco.demo.services;

import com.tarefa_francisco.demo.entities.Aluno;
import com.tarefa_francisco.demo.repository.AlunoRepository;
import com.tarefa_francisco.demo.repository.EnderecoRepository;
import com.tarefa_francisco.demo.repository.NotaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AlunoService {

    private AlunoRepository repository;

    private NotaRepository notaRepository;

    private EnderecoRepository enderecoRepository;

    public AlunoService(AlunoRepository repository, NotaRepository notaRepository, EnderecoRepository enderecoRepository){
        this.repository = repository;
        this.notaRepository = notaRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public List<Aluno> findAll(){
        return repository.findAll();
    }

    public Aluno findById(Long id){
        return repository.findById(id).get();
    }

    public Aluno insert(Aluno aluno){

        notaRepository.save(aluno.getNotas());
        enderecoRepository.save(aluno.getEndereco());
        return repository.save(aluno);
    }

    public Aluno update(Aluno aluno) {
        return repository.save(aluno);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
