import javax.swing.*;
public class calcula {
    
        public static void main(String[] args) throws Exception {



            int primeiro=0,segundo=0;
            double resultado;
    
            double resDiv;
    
                 int opcao=-1;
            // args = argumentos 
            JTextField primeiroField = new JTextField(5);
            JTextField segundoField = new JTextField(5);
            
                JPanel cal = new JPanel();
                  cal.add(new JLabel("Primeiro número"));
                   cal.add(primeiroField);
                    cal.add(Box.createHorizontalStrut(5)); // a spacer
                    cal.add(new JLabel("Segundo número"));
                    cal.add(segundoField);

                    int result = JOptionPane.showConfirmDialog(null, cal, 
                    "Coloque os valores", JOptionPane.OK_CANCEL_OPTION);
                    if (result == JOptionPane.OK_OPTION) {
                  System.out.println("Primeiro " + primeiroField.getText());
                  System.out.println("Segundo" + primeiroField.getText());
      }
    
            // args = argumentos 
            int opcao = -1;
    
                while (opcao!=0){
    
                    System.out.println("Insira uma opção: ");
                    opcao = entrada.nextInt();
                            
                    if ( opcao !=0){
                     System.out.println("Insira o primeiro número: ");
                        primeiro = entrada.nextInt();
    
                       System.out.println("Inserir o segundo número: ");
                          segundo = entrada.nextInt();
                    }
    
                switch (opcao) {
                    case 1 -> {
                        // soma
                        resultado = primeiro+segundo;
                        System.out.println("o resultado é: " + resultado+"\n");
                        break;
    
                    }
    
                    case 2 -> {
                        //subtração 
                        resultado=primeiro-segundo;
                        System.out.println("o resultado é: "+resultado+"\n");
                        break;
                    }
    
                    case 3 -> {
                        resultado=primeiro*segundo;
                        System.out.println("o resultado é: " + resultado+"\n");
                        break;
                        // multiplicação
                    }
    
                    case 4 -> {
                        //Divisão 
                        resDiv=(double)primeiro/(double)segundo;
                        System.out.println("o resultado é: "+resDiv+"\n");
                        break;
    
                    }
    
                    case 5 -> {
                        resultado = Math.pow(primeiro,segundo);
    
                        System.out.println(resultado);
                        break;
                    }
                        
                          case 0 ->{ System.out.println("Encerrando!");
                        break;
                        }
    
                
                    default -> System.out.println("Error");
                     }
                }
    
            
            
        }
    }
    

