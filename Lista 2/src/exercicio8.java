import java.util.Scanner;
import java.util.Locale;
public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double imposto=0;
		if(salario >= 0 && salario <= 2000) {
			System.out.println("ISENTO");
		}else if(salario > 2000 || salario <= 3000) {
			imposto = (salario-2000) * 8/100;

		}else if(salario > 3000 || salario <= 4500) {
			imposto = (salario-3000)*(18/100)+1000*8/100;
			
		}else if(salario > 4500) {
			imposto = (salario-4500)*(28/100) + (1500*18/100) + (1000*8/100);

		}
		System.out.printf("R$ %.2f%n", imposto);
		sc.close();
	}

}
