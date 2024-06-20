package genetica.populacao;

public class filho implements Pai, mae {
    
    private String nome;
    private  int idade;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean altura(double altura) {
        
        return false;
    }
    @Override
    public boolean barba(boolean tam) {
        
        return false;
    }
    @Override
    public boolean calvice(double altura) {
      if (altura > 1.50)
          {
        return true;
      }

    else { return 
        false;
     
    }
       
    }
    @Override
    public String getTipoCabelo(String tipoCabelo) {
        return tipoCabelo;
    }
    @Override
    public String getcorOlhos(String cor) {
        
        return cor;
    }
    @Override
    public String getcorPele(String cor) {
      
        return cor;
    }

         
}
