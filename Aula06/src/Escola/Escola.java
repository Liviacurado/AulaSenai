package Escola;

public class Escola {
    public static void main(String[] args) {

        // se não instanciar o objeto criado (Usando getters e setter)ele retorna null ou 0

        Aluno Livia = new Aluno();

        Livia.setNome("Livia Curado");

        Livia.setIdade(24);

        System.out.println("O nome do aluno é: "+ Livia.getNome());
        System.out.println("A idade do aluno é : "+ Livia.getIdade());

        System.out.println(Livia.calcularNota(7.7,7.9));

    }


}
