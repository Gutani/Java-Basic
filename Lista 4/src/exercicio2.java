import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num, dentro = 0, fora = 0;
		for (int i = 1; i <= n; i++) {
			num = sc.nextInt();
			if (num >= 10 && num <= 20) {
				dentro++;
			} else {
				fora++;
			}

		}
		System.out.println("IN: " + dentro);
		System.out.println("OUT: " + fora);
		sc.close();
	}
}
