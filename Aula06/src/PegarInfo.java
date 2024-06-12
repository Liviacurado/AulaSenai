public class PegarInfo {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Livia",24,'F' );
        Pessoa p2 = new Pessoa("Guilherme",30,'M');
        

        System.out.println("-----------Cadastro----------");
        System.out.println(p1.getPessoa()+"\n"+ p2.getPessoa());
    }

}

