package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas?");
		int pessoas = sc.nextInt();
		sc.nextLine();

		Pessoas[] vetor = new Pessoas[pessoas];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vetor[i] = new Pessoas(nome, idade, altura);
			sc.nextLine();
		}

		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getAltura();
		}
		double mediaAltura = soma / vetor.length;
		
		double menor16 = 0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				menor16++;
			}
		}
		
		double porcentagemMenor16 = menor16 / vetor.length * 100;

		System.out.printf("Altura média: %.2f%n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n ", porcentagemMenor16);
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
		sc.close();
	}

}
