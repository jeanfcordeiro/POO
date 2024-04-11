package vetores;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		int x = vetor[0];
		int posicao = 0;
				
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] > x) {
				x = vetor[i];
				posicao = i;
			}
		}
		 System.out.println("MAIOR VALOR = " + x);
		 System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);
		
		
		sc.close();
	}

}
