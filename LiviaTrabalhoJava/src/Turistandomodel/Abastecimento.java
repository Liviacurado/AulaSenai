package Turistandomodel;

import java.util.Date;
import java.util.List;

public class Abastecimento  {

    private double quantidadeCombustivel;
    private double quilometragemAtual;
    
    public Abastecimento(double quantidadeCombustivel, double quilometragemAtual) {
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.quilometragemAtual = quilometragemAtual;
    }
    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    public double getQuilometragemAtual() {
        return quilometragemAtual;
    }
    public void setQuilometragemAtual(double quilometragemAtual) {
        this.quilometragemAtual = quilometragemAtual;
    }

    
    

}


