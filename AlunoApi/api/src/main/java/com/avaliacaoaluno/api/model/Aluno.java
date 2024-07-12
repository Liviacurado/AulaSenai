package com.avaliacaoaluno.api.model;

import org.springframework.boot.autoconfigure.web.WebProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table (name =  "Aluno")
public class Aluno {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nome;
private int idade;
private String turno;
private char Turma;
private 

}
