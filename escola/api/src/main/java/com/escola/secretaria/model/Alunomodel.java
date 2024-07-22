package com.escola.secretaria.model;

import com.escola.secretaria.Enum.Sexo;
import com.escola.secretaria.Enum.Turma;
import com.escola.secretaria.Enum.Turnos;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "Alunos" )
public class Alunomodel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column (name = "Nome")
@Size(min = 3, max = 50, message = "Deve conter entre 3 e 50 caracteres")
@NotBlank (message = "O nome não pode  ser vazio") 
@Nonnull
private String nome;
// nome varchar (50) not null 

@Column (name = "Matricula")
@NotNull
@Size (min = 5,max=50,message = "A matricula deve conter entre 5 e 50 caracteres")

private String matricula;

@Column (name = "Turno ")
@Enumerated(EnumType.STRING)
@NotNull
private Turnos turnos;

@Column (name= "Turma")
@Enumerated(EnumType.STRING)
@NotNull
private Turma turma;

@Column (name = "Sexo ")
@Enumerated(EnumType.STRING)
@NotNull
private Sexo sexo;

public Sexo getSexo() {
    return sexo;
}

public void setSexo(Sexo sexo) {
    this.sexo = sexo;
}

public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getMatricula() {
    return matricula;
}

public void setMatricula(String matricula) {
    this.matricula = matricula;
}

public Turnos getTurnos() {
    return turnos;
}

public void setTurnos(Turnos turnos) {
    this.turnos = turnos;
}

public Turma getTurma() {
    return turma;
}

public void setTurma(Turma turma) {
    this.turma = turma;
}
}


