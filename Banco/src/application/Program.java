package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Inicial Balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			double withdrawLimit = sc.nextDouble();
			Account account = new Account(number, holder, balance, withdrawLimit);
		
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
		try {
			account.withdraw(amount);
		}
		catch(DomainExceptions e) {
			System.out.println("Withdraw ERROR:" + e.getMessage() );
		}
		sc.close();
	}
}
