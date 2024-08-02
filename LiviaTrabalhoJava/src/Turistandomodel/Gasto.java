package Turistandomodel;
import Enum.CategoriaGasto;
import java.time.LocalDate;
public class Gasto {

   
        private CategoriaGasto categoria;
        private double valor;
        private LocalDate data;
        private String descricao;


        public Gasto(CategoriaGasto categoria, double valor, LocalDate data, String descricao) {
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
        public LocalDate getData() {
                return data;
        }
        public void setData(LocalDate data) {
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


            
        }
    
       

        
      
        

