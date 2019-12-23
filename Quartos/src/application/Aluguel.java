package application;

import java.util.Scanner;

import entities.Estudante;

public class Aluguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Estudante[] quartos = new Estudante[10];
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Qual o nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Qual o email: ");
			String email = sc.nextLine();
			
			System.out.println("Qual o numero do quarto: ");
			int quarto = sc.nextInt();
			
			quartos[quarto] = new Estudante(nome, email);
			
		}
		System.out.println();
		System.out.println("Quartos Ocupados:");
		for(int i=0; i<10; i++) {
			if(quartos[i] != null) {
				System.out.println(quartos[i] + " " + i);
			}
		}
		sc.close();
	}

}
