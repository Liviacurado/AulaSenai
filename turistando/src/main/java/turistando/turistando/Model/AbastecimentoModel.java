package turistando.turistando.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import turistando.turistando.Enum.CombustiveisEnum;

@Entity
public abstract class AbastecimentoModel implements Calculomodel {
    private Date data;
    private Double valor;
    private double abs;
    private double quilometragem;
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


