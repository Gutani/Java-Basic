import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* System.out.println("Hello World");
		int y=32;
		System.out.println(y);
		double x=10.2321321;
		System.out.println(x);
		Locale.setDefault(Locale.US); //altera específica representação geografica, cultural ou regional
		System.out.printf("%.3f",x);*/
		
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int y = sc.nextInt();
		double z = sc.nextDouble();
		Locale.setDefault(Locale.US);
		
		System.out.println("Você digitou: "+x);
		System.out.println("Você digitou: "+y);
		System.out.println("Você digitou:  "+z);
		sc.close();
	}

}
