package genetica.populacao;

public class App {

    public static void main(String[] args)
     {
        filho filho = new filho();

        filho.setNome("Livia");
        filho.setIdade(25);

        System.out.println("Nome: " + filho.getNome());
        System.out.println("Idade: " + filho.getIdade());


        System.out.println("ALtura: " + filho.altura(1.94));
        System.out.println("Tem barba: " + filho.barba(true)); 
        System.out.println("Calvicie: "+ filho.calvice(1.94));
        System.out.println("Cor dos olhos: " + filho.getcorOlhos("Azul"));
        System.out.println("Cor da pele: " + filho.getcorPele("Branca"));
        System.out.println("Tipo de cabelo: " + filho.getTipoCabelo("Cacheado"));
        System.out.println( "cor do cabelo do filho será : " + filho.getCompararCor("Loiro","castanho"));
       
}
}