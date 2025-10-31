import java.util.Scanner;
public class StringEquality {
public static void main(String[] args) {
	
	Scanner sc1 = new Scanner(System.in);
    System.out.print("Por favor, insira um nome: ");
    String nickname = sc1.nextLine();
    
    if (nickname.equals("moe")) {
    	System.out.println("vc é o rei do rock in roll");
    }else {
    	System.out.println("vc não é o rei do rock");
    }
    
    
    sc1.close();
	
     
	}
}

