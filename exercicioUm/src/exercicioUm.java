import java.util.Scanner; //Exerc�cio 1 - Lista 1

public class exercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Enter the first value:");
		x = sc.nextInt();
		System.out.println("Enter the second value:");
		y = sc.nextInt();
		int sum = x + y;
		System.out.println("SUM:" + sum);
		sc.close();
	}

}
