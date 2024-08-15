package turistando.turistando.Model;

import java.util.Date;

import turistando.turistando.Enum.CombustiveisEnum;

public class AbastecimentoModel {
    private Date data;
    
    


    private Double valor;
    private double quantidadeCombustivel;
    private double quilometragem;
    private CombustiveisEnum tipo;
    
    
    
    
    public AbastecimentoModel(Double valor, double quantidadeCombustivel, double quilometragem, CombustiveisEnum tipo,Date data) {
        this.valor = valor;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.quilometragem = quilometragem;
        this.tipo = tipo;
        this.data = data;
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




    public CombustiveisEnum getTipo() {
        return tipo;
    }




    public void setTipo(CombustiveisEnum tipo) {
        this.tipo = tipo;
    }




    @Override
    public String toString() {
                return 
                ", Data: "+  getData() +  
                ", Quilometragem: " +  getQuilometragem() +
                ", TipoCombustivel: " + getTipo() +
                ", Quantidade Combustivel(litros): " +  + getQuantidadeCombustivel();
                

}
}