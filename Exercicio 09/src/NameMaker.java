import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[]) {
    	
    	String firstName,middleName,lastName,fullName;
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("digite o primeiro nome: ");
    	firstName = scanner.nextLine();
    	
    	System.out.println("digite o nome do meio: ");
    	middleName = scanner.nextLine();
    	
    	System.out.println("digite o ultimo nome: ");
    	lastName = scanner.nextLine();
    	
    	fullName = firstName + " " + middleName + " " + lastName;
    	
    	System.out.println("Nome completo: " + fullName);
    	
    	scanner.close();
    	
        
    }
    
}
