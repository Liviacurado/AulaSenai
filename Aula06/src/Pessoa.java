
public class Pessoa {

       
    // public : TODOS 
    //protected : SUBCLASSE 
    //default : PACOTE 
    //private : CLASSE 

    private String nome;
    private int idade;
    private char sexo;

    public Pessoa (String nomePessoa, int idadePessoa, char sexoPessoa){

        this.nome = nomePessoa;
        this.idade = idadePessoa;
        this.sexo = sexoPessoa;

    } 

    public String getPessoa(){
       String info = "A pessoa se chama "+ nome + " tem a idade de " + idade + " anos "+ "e é do sexo " + sexo;
       return info;
    }
}

