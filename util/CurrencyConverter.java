package util;

public class CurrencyConverter {
	
	public static double convReais(double currency, int qtd) {
		return qtd * (currency += currency * 6 /100); // adding 6% of IOF
	}
		
}
