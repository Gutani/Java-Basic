package exercicioQuatro;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int funcionario, horasTrabalhadas;
		double valorHora, salary;
		System.out.println("Numero do Funcionario: ");
		funcionario = sc.nextInt();
		System.out.println("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Valor das horas: ");
		valorHora = sc.nextDouble();

		salary = valorHora * horasTrabalhadas;

		System.out.println("NUMBER: " + funcionario);
		System.out.printf("SALARY: %.2f", salary);
		sc.close();

	}
}
