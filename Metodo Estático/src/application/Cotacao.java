package application;
import java.util.Scanner;
import java.util.Locale;
import entities.CurrencyConverter;

public class Cotacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price?");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double amount = sc.nextDouble();
		
		System.out.println(CurrencyConverter.Converter(amount, price));
		
		sc.close();
	}

}
