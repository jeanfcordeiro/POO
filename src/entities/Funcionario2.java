package entities;

public class Funcionario2 {
	
	private Integer idFuncionario;
	private String nomeFuncionario;
	private Double salarioFuncionario;
	
	public Funcionario2(Integer idFuncionario, String nomeFuncionario, Double salarioFuncionario) {

		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.salarioFuncionario = salarioFuncionario;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(Double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public void aumentoSalario(double porcentagem) {
		salarioFuncionario += salarioFuncionario * porcentagem /100.0;
	}
	
	public String toString() {
		return idFuncionario + ", " + nomeFuncionario + ", " + String.format("%.2f", salarioFuncionario);
	}
}

	
	