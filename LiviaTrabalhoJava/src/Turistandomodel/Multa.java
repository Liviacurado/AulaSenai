package Turistandomodel;

import java.util.Date;
import java.util.List;

public class Multa extends Despesa {

    public Multa(Date data, double valor, String descricao, List<Despesa> despesas) {
        super(data, valor, descricao, despesas);
        
    }
    @Override
    public String toString() {
        return "Outro: " + getDescriçao() + ", Valor: " + getValor() + ", Data: " + getData();
    }
}
