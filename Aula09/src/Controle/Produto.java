package Controle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Produto 
{

    private String nome;
    private int quantidade;
    private double valor;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

@SupressWarnings("deprecation")
    @Override
    public String validade ( Calendar Fabricacao ){
    
        SimpleDateFormat fs = new SimpleDateFormat ("dd/mm//yy");

        Fabricacao.setCalendar(Fabricacao.getCalendarType()+ 180);

        return fs.format(Fabricacao);
        
    }

    
}

