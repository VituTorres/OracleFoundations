import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("escolha um numero");
        num = scanner.nextInt();
        if (num %2 == 0) {
        	System.out.println("o numero é par");
        }else {
        	System.out.println("o numero é impar");
        }
   scanner.close();
    }
}
