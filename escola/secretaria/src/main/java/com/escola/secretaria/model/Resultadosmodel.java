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

@Entity
@Table(name = "Resultados")
public class Resultadosmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id RES")
    private long id;
 
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name="id Disciplina",referencedColumnName = "id Disciplina")
    private Disciplinasmodel idDis;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Disciplinasmodel getIdDis() {
        return idDis;
    }

    public void setIdDis(Disciplinasmodel idDis) {
        this.idDis = idDis;
    }


}
