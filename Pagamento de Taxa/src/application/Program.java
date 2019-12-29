package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Tax;
import entities.PF;
import entities.PJ;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Tax> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c): ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			double anualIncome = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PF(name, anualIncome, healthExpenditures));
			}else {
				System.out.print("Number of Employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new PJ(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println("TOTAL TAX PAID");
		for(Tax print : list) {
			System.out.println(print.getName() + ", $ " + print.tax());
		}
		sc.close();
	}

}
