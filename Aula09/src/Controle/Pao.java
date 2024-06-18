import java.time;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pao extends Produto { 

    private String tipoPao;

    public String getTipoPao() {
        return tipoPao;
    }
    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    private String sabor;
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return sabor;
       
    
    }    
    @Override
    @SupressWarnings("deprecation")
    
    public String validade ( LocalDate Fabricacao,LocalDate validade){
    
        //SimpleDateFormat fs = new SimpleDateFormat ("dd/MM//yyyy");
        LocalDate DataAtual = LocalDate.now();

        if (validade.isAfter(DataAtual)){
            return "Produto Vencido";}
            else if (Fabricacao.isBefore(DataAtual))
                
               return "Dentro da validade";
         else {
             return 
                  "Datas inválidas";
         }

         public long compara( LocalDate Fabricacao, Localdate validade){
            long valor = ChronoUnit.DAYS.between(DataAtual, Localdate);

            return compara;
         }

            public double venda (int pacote ){
                return pacote* 6.50;
            }
    
    
            public double venda (double quilo ){
                return quilo * 15.45;
            }
    }
}

