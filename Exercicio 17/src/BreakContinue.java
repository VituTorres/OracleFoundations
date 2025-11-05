public class BreakContinue {
    
    public static void main( String [] args ) {

               for( int i = 0 ; i < 10 ; i++ ) {
                     // pular numeros pares
                     if( i % 2 == 0) { 
                            continue;
                         
                     }

                     System.out.println("The number is " + i );
                     //parar o loop quando i for igual a 7
                     if( i == 7 ) {
                            break;
                          
                      }

               }
        }

}
