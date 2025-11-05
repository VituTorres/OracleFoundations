import java.util.Scanner;

public class SquareRootWhile {
    @SuppressWarnings("resource")
	public static void main(String args[]) {
    	
    System.out.print("Type a non-negative integer: ");
    Scanner console = new Scanner(System.in);
	int number = console.nextInt();
	
	while (number <0 ) {
		number = console.nextInt();		
		System.out.println("Invalid number, try again:" + number);
	}
	double raiz = Math.sqrt(number);
	
	System.out.println("The square root of " + number + "is " + raiz );
   
    }
    
}
