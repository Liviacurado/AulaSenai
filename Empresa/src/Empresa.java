public class Empresa

{
    public static void main(String[] args) {
        
    }
    private String Funcionário; 
    private String nome;
    private String cpf;
    private double valorVenda;

    public String getFuncionário() {
        return Funcionário;
    }
    public void setFuncionário(String funcionário) {
        Funcionário = funcionário;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

            public double venda (Double novaVenda){

                novaVenda += valorVenda;

                return valorVenda;


            }
             
            public double bonific () {
                
                    return valorVenda * 2.0;

                
            
        
            }
        }
