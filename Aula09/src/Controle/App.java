import java.time.LocalDate;

public class App {
 
    public static void main(String[] args) {

        Pao Pao = new Pao();

        Pao.setTipoPao("De forma ");
        LocalDate primeiro = LocalDate.of(0, 0, 0);
        LocalDate Segundo = LocalDate.of(0, 0, 0);
      

        LocalDate dataAtual = LocalDate.now();

        System.out.println("Faltam"+Pao.compara(primeiro,segundo)+" para o vencimento do produto ") ;
    } 
    
}
