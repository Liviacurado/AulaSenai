package com.avaliacaoaluno.api.model;

import org.springframework.boot.autoconfigure.web.WebProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name =  "Aluno")
public class Alunomodel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nome;
private int idade;
private String turno;
private char Turma;
public char sexo1 = 'F';
public char sexo2 = 'M';

    public Alunomodel(char Turma, int id, int idade, String nome, String turno) {
        this.Turma = Turma;
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public char getTurma() {
        return Turma;
    }

    public void setTurma(char Turma) {
        this.Turma = Turma;
    }

    public char getSexo1() {
        return sexo1;
    }

    public void setSexo1(char sexo1) {
        this.sexo1 = sexo1;
    }

    public char getSexo2() {
        return sexo2;
    }

    public void setSexo2(char sexo2) {
        this.sexo2 = sexo2;
    }



}


