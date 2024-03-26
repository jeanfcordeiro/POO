package udemy_prog_orientada_objeto;

import java.util.Scanner;
import entities.Retangulo;

public class calculo_retangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		System.out.println("Altura: ");
		ret.altura = sc.nextDouble();
		System.out.println("Largura: ");
		ret.largura = sc.nextDouble();
		
		System.out.printf("Área: %.2f%n", ret.area());
		System.out.printf("Perímetro: %.2f%n", ret.perimetro());
		System.out.printf("Diagonal: %.2f%n", ret.diagonal());
		sc.close();
	}

}
