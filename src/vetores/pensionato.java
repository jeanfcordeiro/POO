package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos quartos deseja alugar? ");
		int n = sc.nextInt();
		
		
		Quarto[] vetor = new Quarto[10];
		
		for (int i=0; i<n; i++) {
			System.out.println("Aluguel " + (i+1));
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("E-mail: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int numero = sc.nextInt();
			
			vetor[numero] = new Quarto(nome, email, numero);
			sc.nextLine();

		}
		
		System.out.println("Quarto alugados: ");
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] != null)
			System.out.println(vetor[i].getNumero()+ ": " + vetor[i].getNome() + ", " + vetor[i].getEmail());
		}
		
		
		
		
		sc.close();
	}

}
