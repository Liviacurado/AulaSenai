import java.util.Date;

public abstract class Despesa {

    private Date data;
    private double valor;

    public Despesa(Date data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
}

