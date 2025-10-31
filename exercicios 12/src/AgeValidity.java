import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
    	Scanner sc1 = new Scanner(System.in);
    	System.out.println("digite sua idade");
    	int idade = sc1.nextInt();
    	
    	boolean drivingUnderAge =(idade <= 18);
    	
    	System.out.println("Idade inserida: " + idade);
        System.out.println("Menor de idade para dirigir " + drivingUnderAge);
        
        sc1.close();

       
    }
}
