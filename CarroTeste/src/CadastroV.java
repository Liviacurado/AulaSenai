public class CadastroV extends Veiculo  {
    
    public static void main(String[] args) {

        Carro C1 = new Carro ();

        C1.setNome("Carro");
        C1.setModelo("Fiat");
        C1.setPotencia(5.4);
        C1.setQuantidadeP(4);
        C1.setStatus(true);
        C1.setVelocidade(80);
    

        System.out.println("-----Ficha Carro-------" + "\n");
       
        System.out.println(C1.getNome());
        System.out.println(C1.getModelo());
        System.out.println(C1.getQuantidadeP());
        System.out.println(C1.getStatus());
        System.err.println(C1.getPotencia());
        System.out.println(C1.getVelocidade());

        System.out.println("-----Ações do carro---- " + "\n");

        System.out.println(C1.getNome());
        System.out.println(C1.getModelo());
        System.out.println(C1.getQuantidadeP());
        System.out.println(C1.getStatus());
        System.err.println(C1.getPotencia());
        System.out.println(C1.getVelocidade());

        System.out.println("Velocidade atual: " + C1.getVelocidade());



        System.out.println("\n\n\nAgora vem a moto");

        Moto moto = new Moto();
        moto.setNome("Moto");
        moto.setModelo("Titan");
        moto.setQuantidadeP(2);
        moto.setStatus(false);
        moto.setVelocidade(0);
        moto.setCilindradas(200);

        System.out.println(moto.getNome());
        System.out.println(moto.getModelo());

        System.out.println(moto.getCilindradas());

        System.out.println(moto.getQuantidadeP());

        System.out.println(moto.getStatus());

        System.out.println(moto.getVelocidade());

        Caminhao caminhao =  new Caminhao();

        caminhao.setCarga(true);
        caminhao.setalavanca(true);

        System.out.println("\n\n\nDescarregou? " +"\n"+ caminhao.descarregar(caminhao.isCarga(), caminhao.isalavanca()));

        // carro.acelerar(15);
        // carro.acelerar(15);
        // carro.frear(20);
        // carro.parar();
        // System.out.println("Velocidade atual: " + carro.getVelocidade());

        // carro.parar();
        // System.out.println(carro.getVelocidade());




      }
 }
