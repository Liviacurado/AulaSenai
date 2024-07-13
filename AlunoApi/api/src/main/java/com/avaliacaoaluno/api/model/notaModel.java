package com.avaliacaoaluno.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name =  "Nota")
public class notaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     private long id = 100;
     private double notaBimestre1;
     private double notaBimestre2;
     private double notaBimestre3;
     private double notaBimestre4;

    public notaModel(double notaBimestre1, double notaBimestre2, double notaBimestre3, double notaBimestre4) {
        this.notaBimestre1 = notaBimestre1;
        this.notaBimestre2 = notaBimestre2;
        this.notaBimestre3 = notaBimestre3;
        this.notaBimestre4 = notaBimestre4;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getNotaBimestre1() {
        return notaBimestre1;
    }

    public void setNotaBimestre1(double notaBimestre1) {
        this.notaBimestre1 = notaBimestre1;
    }

    public double getNotaBimestre2() {
        return notaBimestre2;
    }

    public void setNotaBimestre2(double notaBimestre2) {
        this.notaBimestre2 = notaBimestre2;
    }

    public double getNotaBimestre3() {
        return notaBimestre3;
    }

    public void setNotaBimestre3(double notaBimestre3) {
        this.notaBimestre3 = notaBimestre3;
    }

    public double getNotaBimestre4() {
        return notaBimestre4;
    }

    public void setNotaBimestre4(double notaBimestre4) {
        this.notaBimestre4 = notaBimestre4;
    }

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Alunomodel aluno;

    public Alunomodel getAluno() {
        return aluno;
    }

    public void setAluno(Alunomodel aluno) {
        this.aluno = aluno;
    }


}
