package turistando.turistando.Model;

import java.util.Date;

import turistando.turistando.Enum.TipodeGastoEnum;

public class Gastosmodel {

    private TipodeGastoEnum gasto;
    private double valor;
    private Date data;
    private String descricao;

    
    public Gastosmodel(TipodeGastoEnum gasto, double valor, Date data, String descricao) {
        this.gasto = gasto;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
      }

    public TipodeGastoEnum getGasto() {
        return gasto;
    }
    public void setGasto(TipodeGastoEnum gasto) {
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
}
