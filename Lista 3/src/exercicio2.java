import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X,Y;
		X = sc.nextInt();
		Y = sc.nextInt();
		
		while(X!=0 && Y!=0) {
			
			if(X>0 && Y>0) {
				System.out.println("Primeiro Quadrante");
				X = sc.nextInt();
				Y = sc.nextInt();
			}else if(X>0 && Y<0) {
				System.out.println("Quarto Quadrante");
				X = sc.nextInt();
				Y = sc.nextInt();
			}else if(X<0 && Y>0) {
				System.out.println("Segundo Quadrante");
				X = sc.nextInt();
				Y = sc.nextInt();
			}else if(X<0 && Y<0) {
				System.out.println("Terceiro Quadrante");
				X = sc.nextInt();
				Y = sc.nextInt();
			}
		}
		System.out.println("Valor NULO");
		sc.close();
	}

}
