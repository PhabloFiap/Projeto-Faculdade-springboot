package com.estudo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nome", nullable = false)
    private String nome;
    @Column (name = "idade", nullable = false)
    private int idade;

    @Column (name = "renda", nullable = false)
    private double rendaMensal;

    @Column(name = "score", nullable = false)
    private int scoreCredito;



    public Cliente() {
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public int getScoreCredito() {
        return scoreCredito;
    }

    public void setScoreCredito(int scoreCredito) {
        this.scoreCredito = scoreCredito;
    }

}
