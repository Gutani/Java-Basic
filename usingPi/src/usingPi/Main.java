package usingPi; //Exercício 2 - Lista 1
import java.lang.Math;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area, raio;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrada:");
		raio = sc.nextDouble();
		area = 3.14159 * Math.pow(raio, 2);
		System.out.printf("Saída: %.4f", area);
		
		sc.close();
		
	}

}
