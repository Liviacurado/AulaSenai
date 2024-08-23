package com.testetrabalho.Model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.testetrabalho.Enum.CombustiveisEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;


@Entity
public class AbastecimentoModel {
    @Id
    @Column(name = "idabs")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idabs;

    @ManyToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(name = "Placa", referencedColumnName="placa") 
    private VeiculoModel veiculo;

    @Column(name ="data")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date data;

    @Column (name = "Valor")
    @Min(value = 1,message = "o valor não pode ser menor que um")
    @NotNull
    private Double valor;

    @Column (name = "Abs")
    @Min(value = 1,message = "o valor não pode ser menor que um")
    @NotNull
    private double abs;

    @Column (name = "Quilometragem")
    @Min(value = 1,message = "o valor não pode ser menor que um")
    @NotNull
    private double quilometragem;
    
      @Column (name = "Combustíveis ")
      @Enumerated(EnumType.STRING)
       @NotNull
    private CombustiveisEnum tipo;
    
    public AbastecimentoModel(Date data, Double valor, double abs, double quilometragem, CombustiveisEnum tipo) {
        this.data = data;
        this.valor = valor;
        this.abs = abs;
        this.quilometragem = quilometragem;
        this.tipo = tipo;
    }


    public double getAbs() {
        return abs;
    }


    public void setAbs(double abs) {
        this.abs = abs;
    }


    
    
    public Date getData() {
        return data;
    }




    public void setData(Date data) {
        this.data = data;
    }



    public Double getValor() {
        return valor;
    }




    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }




    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }




    public CombustiveisEnum getTipo() {
        return tipo;
    }




    public void setTipo(CombustiveisEnum tipo) {
        this.tipo = tipo;
    }


// crie exceçao para capturar o erro caso o abastecimento seja menos de dois 

  public double Calcularabastecimento(List <AbastecimentoModel> abastecimentos){
        double consumoTotal = 0;
        for (int i = 1; i < abastecimentos.size(); i++) {
            AbastecimentoModel abastecimentoAtual = abastecimentos.get(i);
            AbastecimentoModel abastecimentoAnterior = abastecimentos.get(i - 1);

            double distanciaPercorrida = abastecimentoAtual.quilometragem - abastecimentoAnterior.quilometragem;
            double consumoIndividual = distanciaPercorrida / abastecimentoAtual.abs;
            consumoTotal += consumoIndividual;
        }

         return (consumoTotal / (abastecimentos.size() - 1)); 
    
    }

    
}
