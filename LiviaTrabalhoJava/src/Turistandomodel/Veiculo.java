package Turistandomodel;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private String motorizacao;
    private int capacidadeTanque;
    private String combustiveis;
    private String cor;
    private String placa;
    private String renavam;
    private List<Abastecimento> abastecimentos = new ArrayList<>();
    private List<Gasto> gastos = new ArrayList<>();
    private List<Veiculo> veiculos = new ArrayList<>();

    
    
    public Veiculo(String marca, String modelo, int anoFabricacao, int anoModelo, String motorizacao,
    int capacidadeTanque, String combustiveis, String cor, String placa, String renavam,
    List<Abastecimento> abastecimentos, List<Gasto> gastos, List<Veiculo> veiculos) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.motorizacao = motorizacao;
        this.capacidadeTanque = capacidadeTanque;
        this.combustiveis = combustiveis;
        this.cor = cor;
        this.placa = placa;
        this.renavam = renavam;
        this.abastecimentos = abastecimentos;
        this.gastos = gastos;
        this.veiculos = veiculos;
    }
    
        public List<Veiculo> getVeiculos() {
            return veiculos;
        }
    
    
    
        public void setVeiculos(List<Veiculo> veiculos) {
            this.veiculos = veiculos;
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



    public int getAnoFabricacao() {
        return anoFabricacao;
    }



    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }



    public int getAnoModelo() {
        return anoModelo;
    }



    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }



    public String getMotorizacao() {
        return motorizacao;
    }



    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }



    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }



    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }



    public String getCombustiveis() {
        return combustiveis;
    }



    public void setCombustiveis(String combustiveis) {
        this.combustiveis = combustiveis;
    }



    public String getCor() {
        return cor;
    }



    public void setCor(String cor) {
        this.cor = cor;
    }



    public String getPlaca() {
        return placa;
    }



    public void setPlaca(String placa) {
        this.placa = placa;
    }



    public String getRenavam() {
        return renavam;
    }



    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }



    public List<Abastecimento> getAbastecimentos() {
        return abastecimentos;
    }



    public void setAbastecimentos(List<Abastecimento> abastecimentos) {
        this.abastecimentos = abastecimentos;
    }



    public List<Gasto> getGastos() {
        return gastos;
    }



    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    public void adicionarGasto(Gasto gasto) {
       gastos.add(gasto);
       }

    
    @Override
    public String toString() {
        return String.format(
                "Marca: %s, Modelo: %s, Ano de Fabricação: %d, Ano do Modelo: %d, Motorização: %s, Capacidade do Tanque: %.2f litros, Combustível: %s, Cor: %s, Placa: %s, RENAVAM: %s",
                marca, modelo, anoFabricacao, anoModelo, motorizacao, combustiveis, cor, placa,
                renavam);
    }

}  
    