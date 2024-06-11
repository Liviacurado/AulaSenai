public class Fibonacci {

    static long fib(int num ){

        int F = 0;
        int ant = 0;

        for (int i=1; i <= num;i++){
            if (i==1){

                F=1;
                ant = 0; 
            
            }
            else {

                F+= ant;
                ant = F - ant;

            }

        

        }
        
        return F;

    }  
    static long fibRec( int num){

        if ( num < 2 ){
            return num; 

        }
        else {
            return fibRec (num-1) + fibRec(num-2); 
         }
    }


       static long fibTer (int num ) {

            return (num < 2 ) ? num: fibTer (num - 1) +fibTer ( num - 2);
       }
            private static int [] vetor = new int [50];
            private static int contador;

             static long fibVetor ( int num ) {
                contador = 1;
                return vetRec (num); 
             }

             static long vetRec ( int num ){ 

                if ( num < 0 ){

                    return vetor [0];
                }
                else {
                    if (contador < 3){
                        vetor [num]= contador -1;
                        contador ++;
            
                    }

                    else {
                        vetor [ num ] = vetor [num +1 ] + vetor [ num +2];
                    }
                    return vetRec(num - 1);
                }
             }





    public static void main(String[] args) throws Exception {
          // proporção aurea = fibonacci 

        //0 1 1 2 3 5 8 13 21 34 55 89 144
                 System.out.println("Calculando de maneira iterativa ");

        for (int i= 0;i< 30; i ++){


            System.out.println("("+i+"): "+Fibonacci.fib(i)+"\t");

        }
               System.out.println("Calculando de maneira recursiva 01");

        for (int i= 0;i< 30; i ++){

            System.out.println("("+i+"): "+Fibonacci.fibRec(i)+"\t");   
           
        }

        System.out.println("Calculando de maneira recursiva 02 com operador ternário ");

        for (int i= 0;i< 30; i ++){

            System.out.println("("+i+"): "+ Fibonacci.fibTer(i)+"\t");   
           
        }
        System.out.println("Calculando de maneira recursiva 03 com vetor  ");

        for (int i= 0;i< 30; i ++){

            System.out.println("("+i+"): "+Fibonacci.fibVetor(i)+"\t");   
           
        }

          System.out.println("Esse é o elemento na posição 07: "+ vetor [7]);
        
    }
}
