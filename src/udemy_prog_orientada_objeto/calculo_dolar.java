package udemy_prog_orientada_objeto;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class calculo_dolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o valor do dolar?");
		double valorDolar = sc.nextDouble();
		System.out.println("Quantos dolares deseja comprar?");
		double dolar = sc.nextDouble();
		
		System.out.printf("Valor total da compra: %.2f%n", CurrencyConverter.calculoDolar(valorDolar, dolar));
		
		
		sc.close();
		
	}

}
