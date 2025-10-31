import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Digite seu peso (em quilogramas)");
		double peso = scanner.nextDouble();
		System.out.println("escreva sua altura (em metros)");
		double altura = scanner.nextDouble();
		double imc = peso/Math.pow(altura, 2);
		System.out.println("o valor exato do seu imc é: " + imc);
		
		long imcArredondado = Math.round(imc);
		System.out.println("o valor arredondado é :" + imcArredondado);
		
		String classificacao;
		
		if (imc < 18.5) {
			classificacao = "Abaixo do peso";
		} else if (imc < 25) { 
			classificacao = "Saudável";
		} else {
			classificacao = "Sobrepeso";
		}
		
		System.out.println("voce esta " + classificacao);
		
		scanner.close();
		


	}

}
