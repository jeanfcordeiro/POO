package vetores;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double [] vetor = new double[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i=0; i<vetor.length; i++) {
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.println("ELEMENTOS BAIXO DA MEDIA");
		for (int i=0; i<n; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
