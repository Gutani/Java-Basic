package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee func = new Employee();
		System.out.printf("Name: ");
		func.name = sc.nextLine();
		System.out.printf("Gross Salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.printf("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println(func);
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.IncreaseSalary(percentage);
		
		
		System.out.println("Upadated Data: "+ func);
		sc.close();
	}

}
