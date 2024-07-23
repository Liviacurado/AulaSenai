
import java.util.Date;

public class Abastecimento extends Despesa{


    private double quantidadeCombustivel;
    private double quilometragem;

    public Abastecimento(Date data, double valor, double quantidadeCombustivel, double quilometragem) {
        super(data, valor);
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.quilometragem = quilometragem;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public double getQuilometragem() {
        return quilometragem;
    }
}


