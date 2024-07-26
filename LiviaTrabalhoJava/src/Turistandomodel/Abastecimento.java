package Turistandomodel;

import java.util.Date;
import java.util.List;

public class Abastecimento extends Despesa {

    private double quantidadeCombustivel;
    private double quilometragem;

    
    public Abastecimento(Date data, double valor, String descricao, List<Despesa> despesas,
        double quantidadeCombustivel, double quilometragem) {
        super(data, valor, descricao, despesas);
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.quilometragem = quilometragem;
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


