import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A%B == 0 || B%A ==0) {
			System.out.println("Multiplos");
		}else
			System.out.println("N�o s�o multiplos");
		
		
		sc.close();
	}

}
