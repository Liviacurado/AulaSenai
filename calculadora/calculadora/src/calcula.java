package Calculadora;

import java.util.Scanner;

public class calcula {
    
        public static void main(String[] args) throws Exception {
           
            Scanner entrada = new Scanner (System.in);
            int primeiro=0,segundo=0;
            double resultado;
    
            double resDiv;
    
    
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
    

