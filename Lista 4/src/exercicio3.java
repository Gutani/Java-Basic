import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double num1, num2, num3;

			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			num3 = sc.nextDouble();
			
			double mediaponderada = (num1*2 + num2*3 + num3*5)/10;
			System.out.printf("a M�dia � %.1f",mediaponderada);
		}

		sc.close();
	}
}
