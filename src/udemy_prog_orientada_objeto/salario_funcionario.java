package udemy_prog_orientada_objeto;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class salario_funcionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun = new Funcionario();
		
		System.out.print("Nome do funcionário: ");
		fun.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		fun.salarioBruto = sc.nextDouble();
		
		System.out.print("Valor do imposto: ");
		fun.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nome: " + fun);
		System.out.println();		
		System.out.println("Porcentagem do reajuste salarial: ");
		double porcentagem = sc.nextDouble();
		fun.salarioReajuste(porcentagem);
		
		System.out.println();
		System.out.println("Salário reajustado: " + fun);		
		sc.close();
	}

}
