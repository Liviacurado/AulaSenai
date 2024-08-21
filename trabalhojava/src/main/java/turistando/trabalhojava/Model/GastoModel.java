package turistando.trabalhojava.Model;

import java.util.Date;
import java.util.List;

import turistando.trabalhojava.Enum.TipodeGasto;

public class GastoModel {
    private TipodeGasto gasto;
    private double valor;
    private Date data;
    private String descricao;

    public void Gastosmodel(TipodeGasto gasto, double valor, Date data, String descricao) {
        this.gasto = gasto;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public TipodeGasto getGasto() {
        return gasto;
    }

    public void setGasto(TipodeGasto gasto) {
        this.gasto = gasto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double calcularGastos(List<GastoModel> gastos) {
        double totalGastos = 0;
        for (GastoModel gasto : gastos) {
            totalGastos += gasto.getValor();
        }
        return totalGastos;

    }

}
