import java.util.Scanner;

public class exercicio4o {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		int duracao = 0;
		
		if((horaInicial > 24 && horaFinal > 24) || (horaInicial < 0 && horaFinal < 0 )) {
			System.out.println("As horas est�o incorretas, verifique novamente");
		}
		else if(horaInicial < horaFinal) {
				duracao = horaFinal - horaInicial;
		}else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("A duracao foi de: " + duracao);
		
		
		sc.close();
	}

}
