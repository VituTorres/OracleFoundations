import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
    	Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
        double moviePrice = sc1.nextDouble();
        
        System.out.print("Enter the movie rate \n");
        int movieRate = sc1.nextInt();
        
        while(movieRate >5 || movieRate <0) {
        	System.out.println("Classificação inválida!");
        	
        	System.out.print("Por favor, digite um valor entre 1 e 5: ");
            movieRate = sc1.nextInt();
        }        
        
        if (movieRate == 5 && moviePrice >=12) {
        	System.out.println("estou interessado em assistir o filme");
        	
        }else {
        	System.out.println("não estou interessado em assistir o filme");
        }
        
        sc1.close();

    }
}
