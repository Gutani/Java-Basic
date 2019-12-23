import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cod, qnt;
		double valor;
		
		cod = sc.nextInt();
		if(cod < 1 || cod > 5) {
			System.out.println("Código Incorreto");
			cod = sc.nextInt();
		}
		qnt = sc.nextInt();
		if(qnt<0) {
			System.out.println("Quantidade Incorreta");
			qnt = sc.nextInt();
		}else {
			if(cod == 1) {
				valor = qnt*4;
				System.out.println("O TOTAL É R$ "+valor);
			}
			if(cod == 2) {
				valor = qnt*4.50;
				System.out.println("O TOTAL É R$ "+valor);
			}
			if(cod == 3) {
				valor = qnt*5;
				System.out.println("O TOTAL É R$ "+valor);
			}
			if(cod == 4) {
				valor = qnt*2;
				System.out.println("O TOTAL É R$ "+valor);
			}
			if(cod == 5) {
				valor = qnt*1.50;
				System.out.println("O TOTAL É R$ "+valor);
			}
		}
		
		sc.close();
	}

}
