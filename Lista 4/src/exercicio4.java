import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			double num1, num2;
			double calc;
			
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			
			if(num2==0) {
				System.out.println("Divis�o Imposs�vel");
			}else {
				calc = num1/num2;
				System.out.println(calc);
			}
			
			
		}
		sc.close();
	}
}
