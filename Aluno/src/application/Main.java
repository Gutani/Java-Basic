package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Notas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas notas = new Notas();
		System.out.println("Nome: ");
		notas.nome = sc.nextLine();
		System.out.println("NOTAS: ");
		notas.primeira = sc.nextDouble();
		notas.segunda = sc.nextDouble();
		notas.terceira = sc.nextDouble();
		
		notas.FinalGrade();
		
		System.out.println(notas);
		
		sc.close();
	}

}
