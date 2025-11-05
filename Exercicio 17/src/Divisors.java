import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

         Scanner console = new Scanner(System.in);
         
        System.out.print("Enter the number :  ");
        int num = console.nextInt();
         
        System.out.print("Divisors of " + num+" "+ "="+" " );

        /*inicio do loop for para verificar cada numerode 1 ate num -1
           condição usada : i < num o loop continuara enquanto i for menor que num inserido
           numero de iteraçoes : o loop executara num -1 vezes */
        for (int i = 1; i < num; i++) {
          /* logica do loop: usamos o operador modulo para verificar
          se o resto da divisao de num por i e diferente de 0*/
            if (num % i != 0) {
                continue;
            }
            /*Se a condição 'if' for falsa (ou seja, num % i == 0),
             * o 'continue' não é executado. Isso significa que 'i' É um divisor.
             * O programa então imprime o valor de 'i' seguido de uma vírgula.
             */
            
            System.out.print(i + " , ");
        }
    console.close();
    }

}
