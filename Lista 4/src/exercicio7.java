import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int quad, cubo;
			quad = i*i;
			cubo = i*i*i;
			System.out.println(i+" "+quad+" "+ cubo);
		}
		sc.close();
	}

}
