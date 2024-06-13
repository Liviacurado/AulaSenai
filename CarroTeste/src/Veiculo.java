public class Veiculo {

    String nome;
    String modelo;
    int quantidadeP;
    double potencia;
    int velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadeP() {
        return quantidadeP;
    }

    public void setQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String LigarCarro() {
        return "Carro Liga";
    }

    public String DesligarCarro() {
        return "Carro Desliga";
    }

    public String acelerar() {
        return "Carro acelera ";
    }

    public String FrearCarro() {

        return "Carro Frea ";
    }

    public String PararCarro() {
        return "Carro Para ";
    }

    public static void main(String[] args) {

        Veiculo C1 = new Veiculo();

        C1.setNome("Carro");
        C1.setModelo("Fiat");
        C1.setPotencia(5.4);
        C1.setQuantidadeP(4);

        System.out.println("-----Ficha Carro-------" + "\n");
        System.out
                .println("\n" + " Nome do Veículo: " + C1.getNome() + "\n" + " Modelo: " + C1.getModelo() + "\n"
                        + " Potência: "
                        + C1.getPotencia() + "\n" + " Quantidade de Pneus: " + C1.getQuantidadeP() + "\n");

        System.out.println("-----Ações do carro---- " + "\n");

        System.out
                .println(C1.LigarCarro() + "\n" + C1.DesligarCarro() + "\n" + C1.acelerar() + "\n" + C1.FrearCarro()
                        + "\n" + C1.PararCarro() + "\n");

    }

}
