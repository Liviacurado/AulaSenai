package turistando.trabalhojava.Model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import turistando.trabalhojava.Enum.CombustiveisEnum;

@Entity
@Table(name = "Veiculo")
public class VeiculoModel {

 @Id
 @Column (name = "Placa")
 @NotNull 
 private String placa;

 @Column(name = "Marca")
 @NotBlank (message = "A marca não pode ser vazia") 
 @Nonnull
 private String marca;

 @Column(name = "Modelo")
 @NotBlank (message = "O modelo não pode ser vazio") 
 @Nonnull
 private String modelo;
 
 @Column (name = "Ano Modelo")
 @Min(value = 1,message = "o ano do modelo não pode ser negativo ")
 private int anoModelo;

 @Column (name = "Ano Fabricação")
 @Min(value = 1,message = "o valor não pode ser negativo ")
 private int anoFabricacao;

 @Column(name = "Cor")
 @NotBlank (message = "A Cor não pode ser vazia") 
 @Nonnull
 private String cor;

 @Column (name = "Renavam")
 @Min(value = 1,message = "o valor não pode ser negativo ")
 private long RENAVAM;

 @Column (name = "Motorização")
 @Min(value = 1,message = "o valor não pode ser negativo ")
 private double motorizacao;

@Column (name = "Capacidade do tanque ")
 @Min(value = 1,message = "o valor não pode ser negativo ")
 private double capacidadeTanque;

 @Column (name = "Combustíveis ")
  @Enumerated(EnumType.STRING)
  @NotNull
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