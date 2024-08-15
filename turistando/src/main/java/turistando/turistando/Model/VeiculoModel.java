package turistando.turistando.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import turistando.turistando.Enum.CombustiveisEnum;

@Entity
public class VeiculoModel {
 @Id
 private String placa;
 
 
private String marca;
 private String modelo;
 private int anoModelo;
 private int anoFabricacao;
 private String cor;
 private long RENAVAM;
 private double motorizacao;
 private double capacidadeTanque;
 private CombustiveisEnum combustivel;



 

public VeiculoModel(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String cor,
        long rENAVAM, double motorizacao, double capacidadeTanque, CombustiveisEnum combustivel) {
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.anoModelo = anoModelo;
    this.anoFabricacao = anoFabricacao;
    this.cor = cor;
    RENAVAM = rENAVAM;
    this.motorizacao = motorizacao;
    this.capacidadeTanque = capacidadeTanque;
    this.combustivel = combustivel;
}


public String getPlaca() {
    return placa;
}
public void setPlaca(String placa) {
    this.placa = placa;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public int getAnoModelo() {
    return anoModelo;
}
public void setAnoModelo(int anoModelo) {
    this.anoModelo = anoModelo;
}
public int getAnoFabricacao() {
    return anoFabricacao;
}
public void setAnoFabricacao(int anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
}
public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
public long getRENAVAM() {
    return RENAVAM;
}
public void setRENAVAM(long rENAVAM) {
    RENAVAM = rENAVAM;
}
public double getMotorizacao() {
    return motorizacao;
}
public void setMotorizacao(double motorizacao) {
    this.motorizacao = motorizacao;
}
public double getCapacidadeTanque() {
    return capacidadeTanque;
}
public void setCapacidadeTanque(double capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
}
public CombustiveisEnum getCombustivel() {
    return combustivel;
}
public void setCombustivel(CombustiveisEnum combustivel) {
    this.combustivel = combustivel;
}


}
