package com.escola.secretaria.model;

import com.escola.secretaria.Enum.Disciplinas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Disciplinas")
public class Disciplinasmodel {

    @Id
    @Column(name = "Id Disciplina")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

     
    @OneToOne
    @JoinColumn(name = "idsres", referencedColumnName = "idRes")
    private Resultadosmodel resultados;

    @Column(name = "Nome")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Disciplinas disciplinas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Disciplinas getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplinas disciplinas) {
        this.disciplinas = disciplinas;
    }
}
