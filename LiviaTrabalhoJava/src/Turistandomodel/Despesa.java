package Turistandomodel;

import java.util.Date;
import java.util.List;

public abstract class Despesa {
    
    private Date data;
    private double valor;
    private String descricao;
    private List<Despesa> despesas;
    

    public Despesa(Date data, double valor, String descricao, List<Despesa> despesas) {
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.despesas = despesas;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
     public void setDescricao(String descricao) {
        this.descricao = descricao;
       }
    public String getDescriçao() {
        return descricao;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }
    
    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

}
