
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Calendar C = new Calendar.getInstance();
           Date data = C.getTime();
    
           Gerente gerente1 = new Gerente();

           gerente1.setNome("Livia");
    
           Secretario secretario1 = new Secretario();
           secretario1.setNome("Guilherme");
           
           System.out.println(secretario1.marcaReuniao(data, gerente1.getNome()));
    
    
         
     }
    
    }

