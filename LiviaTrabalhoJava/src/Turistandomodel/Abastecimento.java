package Turistandomodel;

import java.util.List;

public class Abastecimento  {
    private double valor;
    private double quantidadeCombustivel;
    private double quilometragem;
    public List <Abastecimento> abastecimento;

    public Abastecimento(double valor, double quantidadeCombustivel, double quilometragem) {
        this.valor = valor;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.quilometragem = quilometragem;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    

    
  

  
}


