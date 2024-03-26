package entities;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioDesconto() {
		return salarioBruto - imposto;
	}
	
	public void salarioReajuste(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}

	public String toString() {
		return nome + ", R$ " + String.format("%.2f", salarioDesconto());
	}
}
