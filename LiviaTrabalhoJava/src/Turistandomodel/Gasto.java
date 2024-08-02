package Turistandomodel;
import Enum.CategoriaGasto;
import java.util.Date;

public class Gasto {

   
        private CategoriaGasto categoria;
        private double valor;
        private Date data;
        private String descricao;


        public Gasto(CategoriaGasto categoria, double valor, Date data, String descricao) {
                this.categoria = categoria;
                this.valor = valor;
                this.data = data;
                this.descricao = descricao;
        }
        public CategoriaGasto getCategoria() {
                return categoria;
        }
        public void setCategoria(CategoriaGasto categoria) {
                this.categoria = categoria;
        }
        public double getValor() {
                return valor;
        }
        public void setValor(double valor) {
                this.valor = valor;
        }
        public Date getData() {
                return data;
        }
        public void setData(Date data) {
                this.data = data;
        }
        public String getDescricao() {
                return descricao;
        }
        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }
        
        public void adicionarGasto(Gasto gasto) {
                
            }

            @Override
            public String toString() {
                return String.format("%s: %s - R$ %.2f em %s", categoria, descricao, valor, data);
            }

            
        }
    
       

        
      
        

