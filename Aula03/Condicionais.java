import javax.swing.JOptionPane;
public class Condicionais {
    public static void main(String[] args) throws Exception {
        // operadores condicionais 
        // if 
        // else if 
        // else 
        // while
        // operadores lógico 
        // && = e 
        // || = ou 
        // % = modulo ( resto da divisão )
          
        // Exemplo 
        // int num = 15 ;

        // if (num %2 == 0 ||num  <0 )

        // System.out.println("O número é par");

        // else 

        //     System.out.println("o número é ímpar");

       // contadores de repetição = i ou j 
       // repetição : 
       // for 
       // contador ++ é o mesmo que contador = contador +1 e tbm contador += 
       // break = condição de parada 
       
    //   int contador;
    //   for ( contador = 0; contador <=10;contador ++)
      
    //   {System.out.println(contador);}
//   int contador = 1;
//     while ( contador <= 100){
//      if ( contador==51){
//      break;
//      }
//      contador++;
//      System.out.println(contador);
//     } 
     
     
//     int i,j,posi,t,i2;

//     posi= 6;
//     t =1;

//     for ( i=1 ; i<=6; i ++) {
//        for ( j=1 ; j<=10 ; j++ )
//          if (j==posi) {     
//             for (i2=1; i2 <= t; i2 ++) {
//                 System.out.print('*');
//             }
//             t+=2;
//               posi--;

            

//         }
//           else 
//             System.out.print(' ');
           
//                System.out.println();


//          }

        
            
//     }
        

// }

 // VETORES : Sessão de espaços ( um do lado do outro)

           // MATRIZ: vetores organizados em linha ( horizontal e vertical )
           // i = linha  0 a 4
           // j = coluna 0 a 4 

                 // ----------VETOR------------
            // int tam = 10;
            // int vetor  [] = new int[tam];
            // int i;

            //     for ( i=1;i<tam;i++){

            //         vetor [i] = 10;
                    
            //     }
            //        for ( i=1; i<tam;i++) {
                    
            //         System.out.print(vetor [i]+ " ");}

                   //--------- MATRIZ -------

                   
                   // for (i=0;i>=tam;i++){
                       //for (j=0;j<tam ; j ++){
                       // matriz [i][j]= 0;
                       //}
                    //}
                    //for (i=0;i<tam;i++){
                       // for (j=0;j<tam ; j ++){
                       // if (i<=j){
                        //    System.out.print(matriz[i][j]+ " ");
                        //   } 
                        //else { 
                           // System.out.print("  ");
                        //}

                        //System.out.println();
                        
                     //}
                     int opcao = -1;

                     int tam;

                     while(opcao != 0){
                        opcao = Integer.parseInt(JOptionPane.showInputDialog("Opções Disponível:\n1) Diagonal superior esquerda;\n2) Diagonal inferior esquerda;\n3) Diagonal inferior direita;\n4) Diagonal supeior direita;\n0) Sair.","Digite o número da opção:"));
                        switch (opcao) {
                            case 1:
            
                            tam = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho da matriz:"));
            
                            primeiraMatriz(tam);
                                
                                break;
                            case 2:
            
                            tam = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho da matriz:"));
            
                            segundaMatriz(tam);
                                
                                break;
                            case 3:
            
                                tam = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho da matriz:"));
            
                                terceiraMatriz(tam);
            
                                break;
                            case 4:
            
                            tam = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho da matriz:"));
            
                            quartaMatriz(tam);
                                
                                break;
                            case 0:
                                System.out.println("Encerrando!");
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                }
            
            
                public static void primeiraMatriz(int tam){
                    int matriz[][] = new int[tam][tam];
                    for(int i = 0; i < tam; i++){
                        for(int j = 0; j < tam - i; j++){
                            matriz[i][j] = 0;
            
                            System.out.print(matriz[i][j]);
            
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            
                public static void segundaMatriz(int tam){
                    int matriz[][] = new int[tam][tam];
                    for(int i = 0; i < tam; i++){
                        for(int j = 0; j < i+1; j++){
                            matriz[i][j] = 0;
            
                            System.out.print(matriz[i][j]);
            
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            
                public static void terceiraMatriz(int tam){
                    char matriz[][] = new char[tam][tam];
                    for(int i = 0; i < tam; i++){
                        for(int j = 0; j < tam; j++){
                            if(tam - j - 1 > i ){
                                matriz[i][j] = ' ';
                                System.out.print(matriz[i][j]);
                            }
                            else {
                                matriz[i][j] = '0';
                                System.out.print(matriz[i][j]);
                            }
            
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            
                public static void quartaMatriz(int tam){
                    char matriz[][] = new char[tam][tam];
                    for(int i = 0; i < tam; i++){
                        for(int j = 0; j < tam; j++){
                            if(j < i ){
                                matriz[i][j] = ' ';
                                System.out.print(matriz[i][j]);
                            }
                            else {
                                matriz[i][j] = '0';
                                System.out.print(matriz[i][j]);
                            }
            
                        }
                        System.out.println();
                    }
                    System.out.println();
        

    }
}
