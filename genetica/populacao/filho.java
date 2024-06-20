package genetica.populacao;

public class filho implements Pai, mae {
    
    private String nome;
    private  int idade;
    private String corP;
    private String corM;
    private String olhoP;
    private String olhoM;

    public String getOlhoP() {
        return olhoP;
    }
    public void setOlhoP(String olhoP) {
        this.olhoP = olhoP;
    }
    public String getOlhoM() {
        return olhoM;
    }
    public void setOlhoM(String olhoM) {
        this.olhoM = olhoM;
    }
    public String getCorP() {
        return corP;
    }
    public void setCorP(String corP) {
        this.corP = corP;
    }
    public String getCorM() {
        return corM;
    }
    public void setCorM(String corM) {
        this.corM = corM;
    }
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
      if (altura < 1.50)
          {
        return true;
      }

    else { return 
        false;
     
    }
       
    }

    @Override
    public String getcorOlhos() {
    
    if ( olhoP.equalsIgnoreCase("Castanho")&& olhoM.equalsIgnoreCase("Castanho")){
        return "castanho";

     }else if  ( olhoP.equalsIgnoreCase("Castanho") && olhoM.equalsIgnoreCase("Azul")){
          return "Azul";

      }else if 
               ( olhoP.equalsIgnoreCase("Azul") && olhoM.equalsIgnoreCase("Castanho")){
        return "castanho";}

               else 
                   return "Azul";
              
 }
 
    @Override
    public String getcorPele(String cor) {
      
        return cor;
    }
    @Override
    public String getTipoCabelo(){

        if ( corP.equalsIgnoreCase("Castanho")&& corM.equalsIgnoreCase("Castanho")){
           return "castanho";

        }else if  ( corP.equalsIgnoreCase("Castanho") && corM.equalsIgnoreCase("Loiro")){
             return "Loiro";

         }else if 
                 ( corP.equalsIgnoreCase("Loiro") && corM.equalsIgnoreCase("Castanho")){
           return "castanho";}

              else 
                   return "loiro";
                 
    }
        
        

 }    

