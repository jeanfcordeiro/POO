package entities;

public class Conta {

	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public Conta(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString( ) {
		return "Conta: "
				+ numeroConta
				+ ", Titular: "
				+ nome
				+ ", Saldo: R$ "
				+ String.format("%.2f", saldo);
	}
	
}
