import java.util.Calendar;
public class Peta extends Produto
{
    
    private String sabor;
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return sabor;
       
    
    }    
    @Override
    @SupressWarnings("deprecation")

    
    public String validade ( Calendar Fabricacao ){
    
        SimpleDateFormat fs = new SimpleDateFormat ("dd/MM//yyyy");
    
        Fabricacao.setCalendar(Fabricacao.getCalendarType()+ 30);
    
        return fs.format(Fabricacao);
               
            }
    
            public double venda (int pacote ){
                return pacote * 6.50;
            }
    
    
            public double venda (double quilo ){
                return quilo * 15.45;
            }
    }

