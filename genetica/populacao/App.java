package genetica.populacao;

public class App {

    public static void main(String[] args)
     {
        filho filho = new filho();

        filho.setNome("Livia");
        filho.setIdade(25);
        filho.setCorP("loiro");
        filho.setCorM("Loiro");
        filho.setOlhoM("Azul");
        filho.setOlhoP("castanho");

        System.out.println("Nome: " + filho.getNome());
        System.out.println("Idade: " + filho.getIdade());


        System.out.println("ALtura: " + filho.altura(1.64));
        System.out.println("Tem barba: " + filho.barba(false)); 
        System.out.println("Calvicie: "+ filho.calvice(1.64));
        System.out.println("Cor dos olhos: " + filho.getcorOlhos());
        System.out.println("Cor da pele: " + filho.getcorPele("Branca"));
        System.out.println("Tipo de cabelo: " + filho.getTipoCabelo()+"\n");

        filho filho2 = new filho();

        filho2.setNome("Guilherme");
        filho2.setIdade(30);
        filho2.setCorP("loiro");
        filho2.setCorM("castanho");
        filho2.setOlhoM("castanho");
        filho2.setOlhoP("castanho");

        System.out.println("Nome: " + filho2.getNome());
        System.out.println("Idade: " + filho2.getIdade());


        System.out.println("ALtura: " + filho2.altura(1.94));
        System.out.println("Tem barba: " + filho2.barba(true)); 
        System.out.println("Calvicie: "+ filho2.calvice(1.94));
        System.out.println("Cor dos olhos: " + filho2.getcorOlhos());
        System.out.println("Cor da pele: " + filho2.getcorPele("Branca"));
        System.out.println("Tipo de cabelo: " + filho2.getTipoCabelo());

     }
    }