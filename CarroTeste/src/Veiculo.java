
public class Veiculo {

    private String nome;
    private String modelo;
    private int quantidadeP;
    private double potencia;
    private int velocidade;
    private boolean Status;
   
    
    

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
public boolean getStatus() {
        return Status;
    }
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
    public int getVelocidade() {
        return velocidade;
    }
         public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
         }

    // Métodos 

    public String LigarCarro() {
        return "Carro Liga";
    }

    public String DesligarCarro() {
        return "Carro Desliga";
        }
        
          public int acelerar(int novaVelocidade){
           velocidade += novaVelocidade;
              return velocidade;
   }


          public int frear(int novaVelocidade){
           if(velocidade > novaVelocidade)
           return velocidade -= novaVelocidade;
           
         else {
        return velocidade = 0;}
    
   }
            public int parar(){
         return velocidade = 0;

    }
}
