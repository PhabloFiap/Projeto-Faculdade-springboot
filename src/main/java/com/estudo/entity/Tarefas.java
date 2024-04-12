package com.estudo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TAREFAS")
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nome", nullable = false)
    private String nome;
    @Column (name = "descricao", nullable = false)
    private String descricao;

    @Column
    private boolean concluida;

    @Column
    private int prioridade;



    public Tarefas() {
    }

    public Tarefas(String nome, String descricao, boolean concluida, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = concluida;
        this.prioridade = prioridade;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
