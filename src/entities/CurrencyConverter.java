package entities;

public class CurrencyConverter {
	
	public static double valorDolar;
	public static double qntDolar;
	
	public static double calculoDolar(double valorDolar, double qntDolar) {
		double valorTotal = valorDolar * qntDolar;
		double valorImposto = valorTotal * 1.06;
		return valorImposto;
	}
}
