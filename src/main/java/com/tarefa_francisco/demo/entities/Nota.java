package com.tarefa_francisco.demo.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_nota")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonAlias({"Algoritmos e lógica de programação", "logica"})
    private Double logica;

    @JsonAlias({"Banco de dados", "banco"})
    private Double bancoDados;

    @JsonAlias({"Desenvolvimento web I", "web"})
    private Double desenvolvimentoWeb;

    @OneToOne(mappedBy = "notas")
    private Aluno aluno;

    public Nota(){
    }

    public Nota(Long id, Double logica, Double bancoDados, Double desenvolvimentoWeb, Aluno aluno) {
        this.id = id;
        this.logica = logica;
        this.bancoDados = bancoDados;
        this.desenvolvimentoWeb = desenvolvimentoWeb;
        this.aluno = aluno;
    }

    @JsonProperty("Algoritmos e lógica de programação")
    public Double getLogica() {
        return logica;
    }

    public void setLogica(Double logica) {
        this.logica = logica;
    }

    @JsonProperty("Banco de dados")
    public Double getBancoDados() {
        return bancoDados;
    }

    public void setBancoDados(Double bancoDados) {
        this.bancoDados = bancoDados;
    }

    @JsonProperty("Desenvolvimento web I")
    public Double getDesenvolvimentoWeb() {
        return desenvolvimentoWeb;
    }

    public void setDesenvolvimentoWeb(Double desenvolvimentoWeb) {
        this.desenvolvimentoWeb = desenvolvimentoWeb;
    }

    @JsonIgnore
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonIgnore
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
