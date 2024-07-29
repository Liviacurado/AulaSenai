package com.escola.secretaria.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Resultados")
public class Resultadosmodel {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IdRES")
    private long idRes;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Matricula", referencedColumnName = "Matricula")
    private Alunomodel matricula;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id Disciplina", referencedColumnName = "Id Disciplina")
    private Disciplinasmodel idDis;
    
    @Column(name  = "PriNota")
    @NotBlank
    @NotNull
    private double priNota;
    
    @Column(name  = "SegNota")
    @NotBlank
    @NotNull
    private double segNota;
    
    @Column(name  = "TerNota")
    @NotBlank
    @NotNull
    private double terNota;
    
    @Column(name  = "QuaNota")
    @NotBlank
    @NotNull
    private double quaNota;
    
    @Column(name  = "Media")
    @NotBlank
    @NotNull
    private double media;
    
    
    public double getPriNota() {
        return priNota;
    }

    public void setPriNota(double priNota) {
        this.priNota = priNota;
    }

    public double getSegNota() {
        return segNota;
    }

    public void setSegNota(double segNota) {
        this.segNota = segNota;
    }

    public double getTerNota() {
        return terNota;
    }

    public void setTerNota(double terNota) {
        this.terNota = terNota;
    }

    public double getQuaNota() {
        return quaNota;
    }

    public void setQuaNota(double quaNota) {
        this.quaNota = quaNota;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public long getIdRes() {
        return idRes;
    }

    public void setIdRes(long idRes) {
        this.idRes = idRes;
    }

    public Alunomodel getMatricula() {
        return matricula;
    }

    public void setMatricula(Alunomodel matricula) {
        this.matricula = matricula;
    }

    public Disciplinasmodel getIdDis() {
        return idDis;
    }

    public void setIdDis(Disciplinasmodel idDis) {
        this.idDis = idDis;
    }

}


