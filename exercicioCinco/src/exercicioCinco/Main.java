package exercicioCinco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorU1, valorU2, soma;

		System.out.println("Codigo Peca 1: ");
		codPeca1 = sc.nextInt();
		System.out.println("Numero Horas Trabalhadas 1: ");
		numPeca1 = sc.nextInt();
		System.out.println("Valor Unitario Peca 1: ");
		valorU1 = sc.nextDouble();
		
		System.out.println("Codigo Peca 2: ");
		codPeca2 = sc.nextInt();
		System.out.println("Numero Horas Trabalhadas 2: ");
		numPeca2 = sc.nextInt();
		System.out.println("Valor Unit�rio Peca 2: ");
		valorU2 = sc.nextDouble();

		soma = valorU2 * numPeca2 + valorU1 * numPeca1;

		System.out.printf("VALOR A PAGAR: R$ %.2f ", soma);
		sc.close();
	}

}