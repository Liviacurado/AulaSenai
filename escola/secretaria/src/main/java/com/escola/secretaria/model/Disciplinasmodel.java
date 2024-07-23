package com.escola.secretaria.model;

import com.escola.secretaria.Enum.Disciplinas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "Disciplinas")
public class Disciplinasmodel {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long  idDis;

@Column (name = "Nome")
@Enumerated (EnumType.STRING)
@NotNull
private Disciplinas disci;

public long getId() {
    return idDis;
}

public void setIdDis(long idDis) {
    this.idDis = idDis;
}

public Disciplinas getDisci() {
    return disci;
}

public void setDisci(Disciplinas disci) {
    this.disci = disci;
}


}
