package Escola;
public class Aluno {
private String nome;
private int idade;
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


public String calcularNota (double nota1, double nota2){
    double med = (nota1+nota2)/2;
    if (med>=7){
       return "Aproved";

    }
    else{
        return "Reproved";
    }
}
}
