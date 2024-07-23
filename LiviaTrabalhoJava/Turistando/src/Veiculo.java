import java.util.ArrayList;
import java.util.List;

public class Veiculo {
private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private String motorizacao;
    private double capacidadeTanque;
    private List<String> combustiveis;
    private String cor;
    private String placa;
    private String renavam;
    private List<Despesa> despesas;

    public Veiculo(String marca, String modelo, int anoFabricacao, int anoModelo, String motorizacao,
                   double capacidadeTanque, List<String> combustiveis, String cor, String placa, String renavam) {
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
        this.despesas = new ArrayList<>();
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

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public List<String> getCombustiveis() {
        return combustiveis;
    }

    public void setCombustiveis(List<String> combustiveis) {
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

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }


    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }


}

