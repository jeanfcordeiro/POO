package vetores;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i<vetor.length;i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		double media = 0, soma = 0;
		
		int pares = 0;
		for (int i=0; i<vetor.length;i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				pares++;
			}
		}
		
		media = soma / vetor.length;
		
		
		System.out.printf("MÉDIA DOS PARES = %2f", media);
		
		
		
		sc.close();
	}

}
