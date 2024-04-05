package vetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número:");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.2f ", vetor[i]);
		}
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma += vetor[i];
		}
		double media = soma / n;
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);
		
		
		
		sc.close();		
		
	}

}
