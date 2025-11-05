import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        @SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit): ");
        
        int number = console.nextInt();
        
        do { 
        	System.out.print("Enter a number (-1 to quit): ");
        	sum = sum +number;
        	number = console.nextInt();
        }  while (number != -1);



        System.out.println("The sum is " + sum);

    }
}
