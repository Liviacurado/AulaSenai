public class App {
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
     
     
    int i,j,posi,t,i2;

    posi= 6;
    t =1;

    for ( i=1 ; i<=6; i ++) {
       for ( j=1 ; j<=10 ; j++ )
         if (j==posi) {     
            for (i2=1; i2 <= t; i2 ++) {
                System.out.print('*');
            }
            t+=2;
              posi--;

            

        }
          else 
            System.out.print(' ');
           
               System.out.println();


         }

        
            
    }
        

}
