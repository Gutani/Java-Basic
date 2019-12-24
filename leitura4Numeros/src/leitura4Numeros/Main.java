package leitura4Numeros; // Exercício 3 - Lista 1
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, diferenca;
		System.out.println("Entre quatro valores inteiros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A*B-C*D;
		System.out.println("DIFERENCA = " + diferenca);
		sc.close();
	}

}
