package udemy_prog_orientada_objeto;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class conta_bancaria {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Número da Conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Nome do Cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Deseja fazer um depósto inicial? (S/N)");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Digite o valor a ser depositado: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nome, depositoInicial);
		} else  {
			conta = new Conta(numeroConta, nome);
		}
		
		
		System.out.println();
		System.out.println("Informações da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor a ser depositado: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.print("Atualização de informações da conta: ");
		System.out.print(conta);
	
		System.out.println();
		System.out.print("Digite o valor a ser sacado: ");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);
		System.out.print("Atualização de informações da conta: ");
		System.out.print(conta);
		
		sc.close();
	}

}
