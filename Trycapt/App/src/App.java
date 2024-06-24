import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        
//         int []vetor = new int [3];

// try{

//         for (int i=0 ; i < 4; i++){
//             vetor [i]= i;

//             System.out.println(vetor[i]);
    
//          }
//             }
//                catch (IndexOutOfBoundsException e ){

//                    System.err.println(e);
//                    System.out.println(e.getMessage());
                  
//                    System.err.println("Passou do erro ");
//                     }  

//                   catch(ArithmeticException f ){

//                     System.err.println(f);

                        
//                     } 

//                        finally{

//                         System.err.println("Final do segundo try");
                               
//     }
          //   int x = Integer.parseInt(JOptionPane.showInputDialog("Olá"));

            // JOptionPane.showConfirmDialog(null, args, null, x, 0);

        String cep ="";
            String cpf = "";
            String tele  = "";

            JTextField cepField = new JTextField(10);
            JTextField cpField = new JTextField(10);
             JTextField teleField = new JTextField(10);

             Object[] message = {
              "Coloque o cep: ",cepField,
               "Coloque o cpf ",cpField,
               "Coloque o telefone",teleField,};
               
               
              int option = JOptionPane.showConfirmDialog(null, message, "Coloque os dados", JOptionPane.OK_CANCEL_OPTION);
           if (option == JOptionPane.OK_OPTION)
                 {  cpf = cpField.getText();
                    tele= teleField.getText();
                    cep = cepField.getText();
                 }

                 String padraoCep = "##.###.###";
                 String padraotel = "(##) #########";
                 String padraocpf = "###.###.###.##";

                 String cpfFormatado = FormataCpf (cpf,padraocpf);
                 String teleFormatado = FormataTelefone (tele,padraotel);
                 String cepFormatado = FormataCep (cep,padraoCep);

                 JOptionPane.showMessageDialog(null,"CPF"+ cpfFormatado+"Telefone"+tele+ );


  } 
}
  
