package vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario2;

public class lista_salario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario2> lista = new ArrayList<>();

		System.out.println("Quantos funcionários deseja cadastrar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário " + (i + 1));
			System.out.print("Id: ");
			Integer idFuncionario = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nomeFuncionario = sc.nextLine();
			System.out.println("Salario: ");
			Double salarioFuncionario = sc.nextDouble();

			Funcionario2 func = new Funcionario2(idFuncionario, nomeFuncionario, salarioFuncionario);

			lista.add(func);
		}

		System.out.println("Digite o código do funcionário que receberá aumento de salário: ");
		int idSalario = sc.nextInt();
		Integer pos = posicao(lista, idSalario);
		if (pos == null) {
			System.out.println("Esse ID não existe!");
		} else {
			System.out.println("Digito o valor a porcentagem do aumento de salário: ");
			double porcentagem = sc.nextDouble();
			lista.get(pos).aumentoSalario(porcentagem);
		}

		System.out.println();
		System.out.println("Lista de Funcionários:");
		for (Funcionario2 func : lista) {
			System.out.println(func);
		}
		sc.close();
	}

	public static Integer posicao(List<Funcionario2> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getIdFuncionario() == id) {
				return i;
			}
		}
		return null;
	}

}
