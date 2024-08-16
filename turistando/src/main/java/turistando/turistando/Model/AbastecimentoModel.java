package turistando.turistando.Model;

import java.util.Date;

import turistando.turistando.Enum.CombustiveisEnum;

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

    public void Calcularabastecimento(){
       double AbastecimentoAntigo = 0;
       double AbastecimentoAtual = 0;

       double total = (AbastecimentoAntigo - AbastecimentoAtual)/getAbs();

    }

  public void Calcularconsumomedio(){

    

  }

}
