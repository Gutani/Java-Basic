import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if( num%2 == 0 ) { //resto da divis�o do NUMERO por 2 for igual a 0 o n�mero ser� par, sen�o ser� impar
			System.out.println("PAR");
		}
		else 
			System.out.println("IMPAR");
		sc.close();
	}

}
