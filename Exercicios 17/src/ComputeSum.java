import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
    	int soma = 0;
    	int maximoNumeros = 10;
       	System.out.println("Escreva 10 numeros (ou 0 para parar)");
    	
       	for (int i =1; i <= maximoNumeros; i++) {
       		System.out.println("Escreva os numeros"+i+ ": ");
       		int numeros = console.nextInt();
       	
       	if(numeros == 0) {
       		System.out.println("Foi escrito 0. Parando");
       		break;
       	}
       	soma = soma + numeros;
       	
       	}
       	System.out.println("a soma dos numeros é :" + soma);
       
       	console.close();
    }
}
