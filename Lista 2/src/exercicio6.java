import java.util.Scanner;
import java.util.Locale;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();
		
		if(valor < 0 || valor >100) {
			System.out.println("Valor fora do intervalo");
		}
		else if(valor <=25) {
			System.out.println("Valor entre 0 e 25");
		}
		else if(valor <= 50) {
			System.out.println("Valor entre 25 e 50");
		}
		else if(valor <=75) {
			System.out.println("Valor entre 50 e 75");
		}
		else if(valor <=100) {
			System.out.println("Valor entre 75 e 100");
		}
		sc.close();
	}

}
