package entities;

public class Quarto {

	
	private String nome;
	private String email;
	private int numero;
	
	public Quarto(String nome, String email, int numero) {
		
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
