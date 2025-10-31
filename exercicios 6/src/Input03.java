import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
    	Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        int x,y,z,soma;
    	x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        soma = x+y+z;
        System.out.println("a soma é " + soma);
        //Remember to close the Scanner
    	sc.close();
        
    }
}
