package entities;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;

	
	public static double Converter(double amount, double price) {
		return amount*price*IOF;
	}
}
