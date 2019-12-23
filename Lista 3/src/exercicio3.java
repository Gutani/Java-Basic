import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tipo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (tipo != 4) {

			if (tipo == 1) {

				alcool = alcool + 1;

			}

			else if (tipo == 2) {

				gasolina = gasolina + 1;

			}

			else if (tipo == 3) {

				diesel = diesel + 1;

			}

			

			tipo = sc.nextInt();

		}


		
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+ diesel);
		System.out.println("Muito Obrigado!");
		sc.close();
	}

}
