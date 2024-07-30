package com.escola.secretaria.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Resultados")
public class Resultadosmodel implements Serializable{

    
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
    private double priNota;
    
    @Column(name  = "SegNota")
    private double segNota;
    
    @Column(name  = "TerNota")
    private double terNota;
    
    @Column(name  = "QuaNota")
    private double quaNota;
    
    @Column(name  = "Media")
    private double media;

    @Column(name = "ResultadoFinal")
    
    
    public void setResultadoFinal(String resultadoFinal) {
        ResultadoFinal = resultadoFinal;
    }

    public Resultadosmodel(long idRes, Alunomodel matricula, Disciplinasmodel idDis, double priNota, double segNota,
            double terNota, double quaNota, double media) {
        this.idRes = idRes;
        this.matricula = matricula;
        this.idDis = idDis;
        this.priNota = priNota;
        this.segNota = segNota;
        this.terNota = terNota;
        this.quaNota = quaNota;
        this.media = media;
    }

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

    public void resultado(double pri, double seg, double ter, double qua){
        double media = 0.0;
        media = (pri + seg + ter + qua)/4;
        setMedia(media);
    }

      public void statusResultado(double getmedia ){
        
        if (media>=6.0){
            setResultadoFinal("Aprovado");

            if (media==5.9 || media <5.0)
            setResultadoFinal("Recuperação");
        }
        
         else {

           setResultadoFinal("Reprovado");
      }
    }

}

