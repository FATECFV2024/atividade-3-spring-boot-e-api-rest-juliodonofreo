package com.tarefa_francisco.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    private Long id;
    private String nome;
    private Integer idade;
    private String curso;
    private Boolean matriculado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nota_id", referencedColumnName = "id")
    private Nota notas;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    public Aluno() {
    }

    public Aluno(Long id, String nome, Integer idade, String curso, Boolean matriculado, Nota notas, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matriculado = matriculado;
        this.notas = notas;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(Boolean matriculado) {
        this.matriculado = matriculado;
    }

    public Nota getNotas() {
        return notas;
    }

    public void setNotas(Nota notas) {
        this.notas = notas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
