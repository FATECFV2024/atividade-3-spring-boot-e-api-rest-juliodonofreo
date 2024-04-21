package com.tarefa_francisco.demo.controllers;

import com.tarefa_francisco.demo.entities.Aluno;
import com.tarefa_francisco.demo.services.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private AlunoService service;

    public AlunoController(AlunoService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        List<Aluno> entities = service.findAll();
        return ResponseEntity.ok(entities);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> findById(@PathVariable Long id){
        Aluno entity = service.findById(id);
        return ResponseEntity.ok(entity);
    }

    @PostMapping
    public ResponseEntity<Aluno> insert(@RequestBody Aluno aluno){
        Aluno entity = service.insert(aluno);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(aluno.getId()).toUri();
        return ResponseEntity.created(uri).body(entity);
    }

    @PutMapping
    public ResponseEntity<Aluno> update(@RequestBody Aluno aluno){
        Aluno entity = service.update(aluno);
        return ResponseEntity.ok(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
