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
@Entity
@Table (name = "Alunos" )
public class Alunomodel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)


@Column (name = "Matricula")
@NotNull
private long matricula;

@Column(name = "Nome")
@NotBlank (message = "O nome não pode  ser vazio") 
@Nonnull
private String nome;
// nome varchar (50) not null 

@Column (name = "Turno ")
@Enumerated(EnumType.STRING)
@NotNull
private Turnos turnos;

@Column (name= "Turma")
@Enumerated(EnumType.STRING)
@NotNull
private Turma turma;

@Column(name = "Idade")
    @NotNull
    private int idade;
    
    @Column (name = "Sexo ")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Sexo sexo;

public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}

public Sexo getSexo() {
    return sexo;
}

public void setSexo(Sexo sexo) {
    this.sexo = sexo;
}

public long getMatricula() {
    return matricula;
}

public void setMatricula(long matricula) {
    this.matricula = matricula;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
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


